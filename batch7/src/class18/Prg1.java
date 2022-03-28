package class18;

class A {
	int a;

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}
class B extends A{
	
}

class AA {
	int a;

	AA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}
}

public class Prg1 {
	public static void main(String[] args) {
		A a = new A();
		AA aa = new AA(2);
		B b=new B();
	}
}
