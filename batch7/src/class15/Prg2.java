package class15;

public class Prg2 {
	static{
		System.out.println("before main method");
	}
	public static void main(String[] args) {
		System.out.println(Alpha.a);
		Alpha.bhavith();
		
		Alpha alpha=new Alpha();
		System.out.println(alpha.b);
		alpha.swathi();
		
	}
}

class Alpha {
	static int a;

	static {
		a = 100;
	}

	static void bhavith() {
		System.out.println("this is static method from Alpha class");
	}

	int b;
	{
		b = 1000;
	}

	void swathi() {
		System.out.println("this is non static method from Alpha class");
	}
}
