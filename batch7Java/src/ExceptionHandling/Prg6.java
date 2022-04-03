package ExceptionHandling;
//custom Exception

import java.util.Scanner;

class ServiceNotStartedException extends Exception {
    public String getMessage() {
        return "sorry we havn't started that service yet";
    }
}

class Sanath {
    void sample() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sample started");
        System.out.println("Menu:");
        System.out.println("1.cofee");
        System.out.println("2.water");
        System.out.println("3.pizza");
        System.out.println("enter your option:");
        int option = scanner.nextInt();
        if (option == 3) {
            ServiceNotStartedException e = new ServiceNotStartedException();
            try {
                throw e;
            } catch (ServiceNotStartedException e1) {
                e1.printStackTrace();
            } finally {
                scanner.close();
            }
        } else {
            System.out.println("please wait....!");
        }
        System.out.println("sample ended");
    }
}

public class Prg6 {
    public static void main(String[] args) {
        System.out.println("main started");
        Sanath sanath = new Sanath();
        sanath.sample();
        System.out.println("main ended");
    }
}
