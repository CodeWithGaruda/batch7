package multiThreading;

public class Prg4 {
    public static void main(String[] args) throws Exception {
        System.out.println("main started");

        Swathi swathi = new Swathi();
        Bhavith bhavith = new Bhavith();
        Sanath sanath = new Sanath();

        Thread swathiThread = new Thread(swathi, "swathi Thread");
        swathiThread.start();

        Thread bhaviThread = new Thread(bhavith, "bhavith thread");
        bhaviThread.start();

        Thread sanatThread = new Thread(sanath, "sanath Thread");
        sanatThread.start();

        System.out.println(swathiThread.isAlive());

        swathiThread.join();
        bhaviThread.join();
        sanatThread.join();

        System.out.println(swathiThread.isAlive());

        System.out.println("main ended");
    }
}
