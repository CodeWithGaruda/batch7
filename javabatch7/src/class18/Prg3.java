package class18;

//concreate class cant have abstract method

class Pp {
    abstract void show();

    void add() {
        System.out.println("this is add method");
    }

    void sub() {
        System.out.println("this is sub method");
    }
}

// if one method is declare as abstract then we have to declare the whole class
// as abstract
// we cant create the object of abstract class
abstract class Sample1 {
    abstract void sample();
}

// abstract class can have any number of concreate methods
abstract class Alpha {
    abstract void show();

    void add() {
        System.out.println("this is add method");
    }

    void sub() {
        System.out.println("this is sub method");
    }
}

public class Prg3 {
    public static void main(String[] args) {
        // we cant create the object of abstract class
        Alpha alpha = new Alpha();
    }
}
