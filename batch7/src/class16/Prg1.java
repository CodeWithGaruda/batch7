package class16;

class Ramana{
	void house() {
		System.out.println("bramhin bazar");
	}

	void car() {
		System.out.println("I10 car green");
	}
	
}

class Bhavith extends Ramana{
	
}
class Sibling extends Ramana{
	
}

public class Prg1 {
	public static void main(String[] args) {
		// inheritance
		Bhavith b=new Bhavith();
		b.car();
	}

}
