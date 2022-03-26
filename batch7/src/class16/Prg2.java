package class16;

class RamaKrishna{
	void house() {
		System.out.println("i have a house");
	}
	void bike() {
		System.out.println("i have HeroHonda");
	}
}
class Swathi extends RamaKrishna{
	@Override
	void bike() {
		System.out.println("scooty pep");
	}
	
	void pet() {
		System.out.println("i pet many animals");
	}
}


public class Prg2 {
	public static void main(String[] args) {
		Swathi swathi=new Swathi();
		//in swathi class we dont have bike method it inherited from its parent class
		swathi.house();
		//these kind of methods are called inherited methods
		
		//parent class has bike method bt child is customizing according to their need
		//this is called over ridden method
		swathi.bike();
		
		//specialized method
		//exists only in child class
		swathi.pet();
		
	}

}
