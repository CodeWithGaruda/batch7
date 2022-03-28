package class17;

class XYZ{
	void disp(Animal animal) {
		animal.breath();
		animal.eat();
	}
}

class Animal{
	void breath() {
		System.out.println("breaths oxygen");
	}
	void eat() {
		System.out.println("i eat food to live");
	}
}
class Lion extends Animal{
	@Override
	void eat() {
		System.out.println("iam carniours");
	}
	void king() {
		System.out.println("iam king of jungle");
	}
}
class Fish extends Animal{
	@Override
	void eat() {
		System.out.println("i eat alge");
	}
	void breathUnderWater() {
		System.out.println("i breath through gills");
	}
}
class Bird extends Animal{
	@Override
	void eat() {
		System.out.println("i hunt and eat worms or Bugs");
	}
	void fly() {
		System.out.println("i can fly in air");
	}
}

public class Prg1 {
	public static void main(String[] args) {
		
		Lion simba=new Lion();
		Fish dory=new Fish();
		Bird rio=new Bird();
		
//		simba.breath();
//		simba.eat();
//		simba.king();
//		
//		dory.breath();
//		dory.eat();
//		dory.breathUnderWater();
//		
//		rio.breath();
//		rio.eat();
//		rio.fly();
		
		//Polymorphism
		XYZ xyz=new XYZ();
		xyz.disp(simba);
		xyz.disp(dory);
		xyz.disp(rio);
		
		//accessing specialized method
		Animal animal;
		
		animal=simba;
		animal.breath();
		animal.eat();
		((Lion)animal).king();//DownCasting
		
		animal=dory;
		animal.breath();
		animal.eat();
		((Fish)animal).breathUnderWater();//DownCasting
	}
}
