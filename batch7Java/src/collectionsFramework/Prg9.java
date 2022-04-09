package collectionsFramework;

public class Prg9 {
    public static void main(String[] args) {
        int a = 5;
        Integer num = a;// auto-boxing
        Integer i = 55;
        int ii = i.intValue();// unboxing
        System.out.println(ii);
        Integer integer = Integer.parseInt("5");

        System.out.println(num + integer);
    }
}
