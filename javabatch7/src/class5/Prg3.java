package class5;

import java.util.Scanner;

public class Prg3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // aritmatic expressions(+,-,*,/,%)
        int num1, num2;
        System.out.print("enter number:");
        num1 = scanner.nextInt();
        System.out.print("enter number:");
        num2 = scanner.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println((float) num1 / num2);
        float f = scanner.nextFloat();
        System.out.println(num1 / f);
        scanner.close();
    }
}
