package class15;

public class Prg1 {
	static int a;
	
	static {
		a = 100;
	}

	static void bhavith() {
		System.out.println("this is bhavith method");
	}

	public static void main(String[] args) {
		System.out.println(a);
		bhavith();
	}

}
