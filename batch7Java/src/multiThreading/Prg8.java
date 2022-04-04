package multiThreading;

class Producer extends Thread {
    Mediator mediator;

    Producer(Mediator mediator) {
        this.mediator = mediator;
        this.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            try {
                mediator.put(++i);
            } catch (InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    Mediator mediator;

    Consumer(Mediator mediator) {
        this.mediator = mediator;
        this.start();
    }

    public void run() {
        while (true) {
            try {
                mediator.get();
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Mediator {
    int num;
    boolean value = false;

    synchronized void put(int num) throws InterruptedException {
        while (value) {
            wait();
        }
        this.num = num;
        System.out.println("producer:" + num);
        value = true;
        notify();
    }

    synchronized void get() throws InterruptedException {
        while (!value) {
            wait();
        }
        System.out.println("consumer:" + num);
        value = false;
        notify();
    }
}

public class Prg8 {
    public static void main(String[] args) throws Exception {
        Mediator mediator = new Mediator();
        new Producer(mediator);
        new Consumer(mediator);
    }
}
