package multiThreading;

class Squeez extends Thread {
    public void run() {
        if (Thread.currentThread().getName().equals("swathi")) {
            try {
                cafe();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (Thread.currentThread().getName().equals("bhavith")) {
            try {
                realEstate();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (Thread.currentThread().getName().equals("sanath")) {
            try {
                javaKlass();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    void cafe() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("i will give u pizza");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(100);
        }
    }

    void realEstate() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("i bought a flat and sold it");
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(200);
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

public class Prg5 {
    public static void main(String[] args) {
        Squeez squeez = new Squeez();
        Thread swathiThread = new Thread(squeez, "swathi");
        Thread bhavithThread = new Thread(squeez, "bhavith");
        Thread sanatThread = new Thread(squeez, "sanath");
        swathiThread.start();
        bhavithThread.start();
        sanatThread.start();
    }
}
