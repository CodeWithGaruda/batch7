package multiThreading;

public class Prg4 {
    public static void main(String[] args) throws Exception {
        System.out.println("main started");

        Swathi swathi = new Swathi();
        Bhavith bhavith = new Bhavith();
        Sanath sanath = new Sanath();

        swathi.start();

        bhavith.start();

        sanath.start();

        System.out.println(swathi.isAlive());

        swathi.join();
        bhavith.join();
        sanath.join();

        System.out.println(swathi.isAlive());

        System.out.println("main ended");
    }
}
