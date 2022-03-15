package class5;

import java.util.Scanner;

public class Prg4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 10, b = 20;
        System.out.print(a < b);// t
        System.out.print(a > b);// f
        System.out.print(a <= b);// t
        System.out.print(a >= b);// f
        System.out.print(a != b);// t
        System.out.print(a == b);// f
        scanner.close();
    }
}
