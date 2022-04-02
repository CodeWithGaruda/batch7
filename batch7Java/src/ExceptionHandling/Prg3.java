package ExceptionHandling;

class Bhavith {
    void sample() throws Exception {
        System.out.println("sample started");
        int a = 5, b = 0;
        System.out.println(a / b);
        System.out.println("sample started");
    }
}

public class Prg3 {
    public static void main(String[] args) throws Exception {
        System.out.println("main started");
        Bhavith bhavith = new Bhavith();
        bhavith.sample();
        System.out.println("main ended");
    }
}
