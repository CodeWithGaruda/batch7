package multiThreading;

public class Prg2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main started");
        System.out.println(System.currentTimeMillis());
        long initial = System.currentTimeMillis();
        Thread.sleep(5000);
        System.out.println(System.currentTimeMillis() - initial);
        System.out.println("main ended");
    }
}
