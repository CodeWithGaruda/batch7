package multiThreading;

class Swathi extends Thread {
    public void run() {
        try {
            cafe();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void cafe() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("i will give u pizza");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
        }
    }
}

class Bhavith extends Thread {
    @Override
    public void run() {
        try {
            realEstate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void realEstate() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("i bought a flat and sold it");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(200);
        }
    }
}

class Sanath extends Thread {
    @Override
    public void run() {
        try {
            javaKlass();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void javaKlass() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("i will tell a batch and take some rest");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(200);
        }
    }
}

public class Prg3 {
    public static void main(String[] args) throws Exception {
        System.out.println("main started");

        Swathi swathiThread = new Swathi();
        swathiThread.setName("swathi");
        Bhavith bhaviThread = new Bhavith();
        bhaviThread.setName("bhavith");
        Sanath sanatThread = new Sanath();
        sanatThread.setName("sanathThread");

        swathiThread.start();
        bhaviThread.start();
        sanatThread.start();

        System.out.println("main ended");
    }
}
