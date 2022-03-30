package ExceptionHandling;

//3 types to handle exception
/*
1.handling->try-catch
2.rethrowing ->try-catch ,throw,throws,finally
3.ducking->throws
*/

class Swathi {
    void sample() throws Exception {
        System.out.println("sample started");
        int a = 5, b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println(e);
            throw e;
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        } finally {
            System.out.println("sample ended");
        }
    }
}

public class Prg2 {
    public static void main(String[] args) {
        System.out.println("main started");
        Swathi swathi = new Swathi();
        try {
            swathi.sample();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("main ended");

    }
}
