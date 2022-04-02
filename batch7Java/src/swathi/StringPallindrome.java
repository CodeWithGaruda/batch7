package swathi;

import java.util.Scanner;

public class StringPallindrome {
    static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the no of strings :");
        int size = scanner.nextInt();
        String[] array = new String[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter strings:");
            array[i] = scanner.next();
        }
        for (String string : array) {
            check(string);
        }

        // for (int i = 0; i < array.length; i++) {
        // check(array[i]);
        // }

        System.out.println(count);
        scanner.close();
    }

    public static void check(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (rev.equals(s)) {
            System.out.print(rev + " ");
            count++;
        }
    }
}
