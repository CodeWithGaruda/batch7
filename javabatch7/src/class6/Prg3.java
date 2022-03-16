package class6;

import java.util.Scanner;

public class Prg3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cafe Music Retro Menu:");
        System.out.println("1.Black cofee");
        System.out.println("2.capuccino");
        System.out.println("3.iced coffee");
        System.out.println("4.Mocha");
        System.out.print("enter your choice:");
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                System.out.println("u have ordered black cofee\nplease wait for 10 mins");
                break;
            case 2:
                System.out.println("u have ordered capuccino cofee\nplease wait for 5 mins");
                break;
            case 3:
                System.out.println("u have ordered iced cofee\nplease wait for 15 mins");
                break;
            case 4:
                System.out.println("u have ordered Mocha cofee\nplease wait for 20 mins");
                break;
            default:
                System.out.println("sorry beyond our expectation");
        }
        System.out.println("thanks for coming");
    }
}
