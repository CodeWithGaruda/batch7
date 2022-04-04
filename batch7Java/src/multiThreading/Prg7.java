package multiThreading;

class Counter {
    synchronized static void increment() {
        Prg7.count++;
    }
}

class Chinnu implements Runnable {
    @Override
    public void run() {
        try {
            work();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void work() throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            Counter.increment();
            Thread.sleep(100);
        }
    }
}

class SwathiGomez implements Runnable {
    @Override
    public void run() {
        try {
            work();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void work() throws InterruptedException {
        for (int i = 0; i < 50; i++) {
            Counter.increment();
            Thread.sleep(100);
        }
    }
}

public class Prg7 {
    static int count;

    public static void main(String[] args) throws Exception {
        System.out.println("started");
        SwathiGomez sGomez = new SwathiGomez();
        Thread sThread = new Thread(sGomez, "swathi");

        Chinnu bChinnu = new Chinnu();
        Thread bThread = new Thread(bChinnu, "bhavith");

        sThread.start();
        bThread.start();

        sThread.join();
        bThread.join();

        System.out.println(count);
        System.out.println("ended");
    }
}
