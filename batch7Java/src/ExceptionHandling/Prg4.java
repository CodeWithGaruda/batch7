package ExceptionHandling;

public class Prg4 {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.sam();
    }
}

class Alpha {
    void sam() {
        sam();
    }
}