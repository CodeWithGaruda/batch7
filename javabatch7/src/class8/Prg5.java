package class8;

import java.util.Scanner;

public class Prg5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // do-while
        boolean option;
        do {
            System.out.println("MENU:");
            System.out.println("1.Black Cofee");
            System.out.println("2.Cofee");
            System.out.println("3.cold Cofee");
            System.out.println("4.iced Cofee");
            System.out.print("please enter your option:");
            int a = scanner.nextInt();
            System.out.println("your order on the way");
            System.out.print("do u want to continue(true/false):");
            option = scanner.nextBoolean();
        } while (option);
        System.out.print("thanks for visiting us");
    }
}
