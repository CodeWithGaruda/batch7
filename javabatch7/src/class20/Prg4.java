package class20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//8.a class can have multiple implementations
interface A {
    void add();
}

interface B {
    void add();

    void sub();
}
// 9.one interface cant implement another interface
// interface C implements B{

// }
// 10.one interface can extends another interface
interface D extends B {
    void mul();
}

class Swathi implements A, B {
    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }

}

// 11.a class can extend another class and can also implement another interface
class Beta extends Swathi implements D, Serializable {
    @Override
    public void mul() {
    }
}

// 12.if we declare any methods inside an interface by default the method is
// public and abstract
// 13.we can also create variable=>it is automatically pulbic,static,final
// 14.an empty interface is permitted in java.it is also called as marker or
// tagged interface

// serialized,clonable

interface Sanath {

}

public class Prg4 {
    public static void main(String[] args) throws IOException {
        D d = new Beta();
        System.out.println(d);
        FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(d);
        System.out.println("success");
    }
}
