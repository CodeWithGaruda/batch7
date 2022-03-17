package class7;

public class Prg4 {
    public static void main(String[] args) {
        int year = 1600;
        if (year % 4 == 0)
            if (year % 100 == 0 && year % 400 != 0)
                System.out.print("not a leap year");
            else
                System.out.print("leap year");
        else
            System.out.print("not leap year");
    }
}
