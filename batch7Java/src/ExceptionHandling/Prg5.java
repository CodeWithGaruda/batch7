package ExceptionHandling;

import java.io.IOException;

//if parent class method has checked exception and over ridden method can have unchecked exception => possible 
//vice versa is not possibleArithmeticException,
class Demo {
    void sample() throws IOException {

    }
}

class Demo1 extends Demo {
    void sample() throws ArithmeticException {

    }
}

public class Prg5 {
    public static void main(String[] args) {
        // FileWriter writer = new FileWriter("");
    }
}
