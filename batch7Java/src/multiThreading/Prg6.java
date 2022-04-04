package multiThreading;

class Alpha implements Runnable {
    @Override
    public void run() {
        try {
            work();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void work() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("im doing some work ALPHA => " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

class Beta implements Runnable {
    public void run() {
        try {
            work();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void work() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println("im doing some work BETA => " + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

public class Prg6 {
    public static void main(String[] args) {
        Alpha swathi = new Alpha();
        Beta bhavith = new Beta();

        Thread swathiThread = new Thread(swathi, "swathi-thread");
        Thread bhavithThread = new Thread(bhavith, "bhavith-thread");

        swathiThread.start();
        bhavithThread.start();

    }
}
