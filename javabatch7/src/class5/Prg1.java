package class5;

import java.util.Scanner;

public class Prg1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value:");
        int age1 = scanner.nextInt();
        System.out.println("given:" + age1);
        float f = scanner.nextFloat();
        System.out.println("given:" + f);
        scanner.close();
    }
}
