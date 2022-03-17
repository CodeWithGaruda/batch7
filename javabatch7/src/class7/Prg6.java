package class7;

public class Prg6 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("-------------");
        i = 1;
        do {
            System.out.print(i);
            i++;
        } while (i <= 5);
    }
}
