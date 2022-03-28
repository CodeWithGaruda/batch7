package class18;

//abstract=>theme,why we use this,IDEA

//abstraction
abstract class Parent {
    // u cant declare the variable a abstract
    // abstract int a;

    // 1.abstract class can have all the methods as abstract
    abstract void car();

    abstract void bike();

    abstract void land();
}

class Child extends Parent {
    void car() {
        System.out.println("i want to buy a hundai white car");
    }

    void bike() {
        System.out.println("we need a scooty suzuki access");
    }

    void land() {
        System.out.println("i will make one house in that land");
    }

}

public class Prg1 {
    public static void main(String[] args) {
        Child bhavith = new Child();
        bhavith.car();
    }
}