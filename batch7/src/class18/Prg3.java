package class18;

class Parent {
	Parent() {
		this(1);
		System.out.println("parent class 0 args");
	}

	Parent(int a) {
		super();
		System.out.println("parent class 1 args");
		
	}

	Parent(int a, int b) {
		this();
		System.out.println("parent class 2 args");
	}

}

class Child extends Parent {
	Child() {
		super(1,2);
		System.out.println("child class 0 args");
	}

	Child(int a) {
		this();
		System.out.println("child class 0 args");
	}

	Child(int a, int b) {
		super();
		System.out.println("child class 0 args");
	}

}

public class Prg3 {
	public static void main(String[] args) {
		Child bhavith = new Child(1);
		
	}
}
