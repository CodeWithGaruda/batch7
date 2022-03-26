package class16;

class Airplane {
	void fly() {
		System.out.println("it fly");
	}

	void capacity() {
		System.out.println("a plane normally should have 50 seats");
	}
}

class CargoPlane extends Airplane {
	@Override
	void capacity() {
		System.out.println("it has 100 seats of capacity");
	}

	void load() {
		System.out.println("i can carry heavy load");
	}
}

class FighterPlane extends Airplane {
	@Override
	void capacity() {
		System.out.println("it has 5 seats");
	}

	void speed() {
		System.out.println("u cant match my speed");
	}
}

class PassengerPlane extends Airplane {
	@Override
	void capacity() {
		System.out.println("300 seats");
	}

	void customerService() {
		System.out.println("good service");
	}
}

public class Prg3 {
	public static void main(String[] args) {
		CargoPlane cargoPlane=new CargoPlane();
		FighterPlane fighterPlane =new FighterPlane();
		PassengerPlane passengerPlane=new PassengerPlane();
		
		cargoPlane.fly();
		cargoPlane.capacity();
		cargoPlane.load();
		
		fighterPlane.fly();
		fighterPlane.capacity();
		fighterPlane.speed();
		
		passengerPlane.fly();
		passengerPlane.capacity();
		passengerPlane.customerService();
		
	}
}
