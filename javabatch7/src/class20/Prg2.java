package class20;

//an interface can have n number of inplementations
interface Calci {
    void add();

    void sub();

    void mul();

    void div();
}

class Calculator1 implements Calci {
    @Override
    public void add() {
        System.out.println("add calc1");
    }

    public void sub() {
        System.out.println("add");
    }

    public void mul() {
        System.out.println("add");
    }

    public void div() {
        System.out.println("add");
    }

    public void sample() {
        System.out.println("this is specialsed");
    }
}

class Calculator2 implements Calci {
    public void add() {
        System.out.println("add calc 2");
    }

    public void sub() {
        System.out.println("add");
    }

    public void mul() {
        System.out.println("add");
    }

    public void div() {
        System.out.println("add");
    }
}

public class Prg2 {
    public static void main(String[] args) {
        // Calci c=new Calci();
    }
}
