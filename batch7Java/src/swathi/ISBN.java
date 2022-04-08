package swathi;

import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter ISBN:");
        String isbn = scanner.next();
        int res = validateNumber1(isbn);
        System.out.println(res);
        scanner.close();
    }

    public static int validateNumber1(String number) {
        if (number.isEmpty())
            return -1;
        long isbn = 0;
        int flag = 10;
        // step -1: 1234567890
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            String string = ch + "";
            isbn = isbn + Integer.parseInt(string) * flag;
            flag--;
        }
        if (isbn % 11 == 0)
            return 1;
        else
            return 0;
    }

    public int validateNumber(String input) {
        if (input.isEmpty())
            return -1;
        long isbn = 0;
        int flag = 10;
        // step -1: 1234567890
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            String string = ch + "";
            isbn = isbn + Integer.parseInt(string) * flag;
            flag--;
        }
        if (isbn % 11 == 0)
            return 1;
        else
            return 0;
    }
}
