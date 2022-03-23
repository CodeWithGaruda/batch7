package class12;

public class Prg2 {

	public static void main(String[] args) {
		//method overloading
		swathi();
	}
	static int sanath(int val) {
		return val*10;
	}
	static void swathi() {
		System.out.println("0");
	}
	
	static void swathi(int a) {
		System.out.println("1");
	}

	static void swathi(float b) {
		System.out.println("2");
	}

	static void swathi(int a, double b, int c) {
		System.out.println("3");
	}

}
