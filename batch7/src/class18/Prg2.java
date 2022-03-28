package class18;

class Bhavith extends Object {
	Bhavith(int a) {
		this();
		System.out.println("this is parameterized constructor of Bhavith");
	}

	Bhavith(int i, int j) {
		super();
		System.out.println("2 args");
	}

	Bhavith() {
		this(1, 2);
		System.out.println("this is no args constructor");
	}
}

public class Prg2 {
	public static void main(String[] args) {
		Bhavith bb = new Bhavith(1);
	}
}
