package class8;

public class Prg3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5)
                break;
        }
        for (int i = 0; i < 10; i++) {
            if (i == 5 || i == 7 || i == 3)
                continue;
            System.out.println(i);

        }
    }
}
