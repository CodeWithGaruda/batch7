package class6;

public class Prg2 {
    public static void main(String[] args) {
        // pre(++a) and post(a++)
        int a = 10, b;
        b = ++a;
        System.out.println(b);
        System.out.println(a);
        a /= 5;
        System.out.println(a);
    }
}
