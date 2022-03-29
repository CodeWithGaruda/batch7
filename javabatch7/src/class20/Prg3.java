package class20;

//2.it promotes polymorphism
//3.it is used to achieve standardization
//4.we cant create an object for interface
//5.though we can't create an object of interface we can declare the reference variable for interface
//6.it is not compulsory that an implement class should have any implement methods it can also have specialized method using interface reference we cant access the specialized method
//7.it is not compulsory for implementing class to give body for all the implemented methods.if the implement class is not giving body for all methods then we have to declare class as abstract

interface Alpha {
    void aa();

    void bb();
}

abstract class Bhavith implements Alpha {
    @Override
    public void aa() {
        System.out.println("i know aa method");
    }
}

public class Prg3 {
    public static void main(String[] args) {
        Calci c;
        c = new Calculator1();
        c.add();
        ((Calculator1) c).sample();
        c = new Calculator2();
        c.add();

    }
}
