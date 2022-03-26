package class15;

class Customer {
	int principal;
	int time;
	static double rateOfIntrest = 2.5;

	Customer(int principal, int time) {
		this.principal = principal;
		this.time = time;
	}

	void simpleIntrest() {
		System.out.println((principal * time * rateOfIntrest) / 100);
	}
}

public class Prg3 {
	public static void main(String[] args) {

		Customer bhavith = new Customer(100000, 5);
		bhavith.simpleIntrest();

		Customer sanath = new Customer(10000000, 10);
		sanath.simpleIntrest();

		Customer sbit = new Customer(2000000, 3);
		sbit.simpleIntrest();

		System.out.println(Math.PI);

	}
}
