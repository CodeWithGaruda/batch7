package class16;

class Alpha {
	protected int a=100;
	int b=1000;
}

class Beta extends Alpha {

}

class Beta2 extends Beta {

}
class Beta3 extends Beta2 {

}

class Omega {

}

public class Prg4 {
	public static void main(String[] args) {
		Beta3 b = new Beta3();
		Beta2 b2 = new Beta2();
		Omega o = new Omega();
		System.out.println(b2 instanceof Beta3);
		//System.out.println(o instanceof Alpha);
		System.out.println(b2.a);
		Alpha a=new Alpha();
	}
}
