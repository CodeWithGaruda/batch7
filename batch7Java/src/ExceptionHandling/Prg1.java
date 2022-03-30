package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Prg1 {
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter a number:");
        try {
            int a = Scanner.nextInt();
            System.out.println("enter b number:");
            int b = Scanner.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("u have didvided with 0");
        } catch (InputMismatchException e) {
            System.out.println("u have given double in place of int");
        } catch (Exception e) {
            System.out.println(e);
        }
        Scanner.close();
        System.out.println("main ended");
    }
}
