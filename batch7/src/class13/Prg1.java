package class13;

//complete definition of object is class
class Laptop {
	double displaySize;
	int ram;
	String brand;

	int work() {
		System.out.println("i will work accordingly to my properties or attributes");
		return 5;
	}

	@Override
	public String toString() {
		return "Laptop [displaySize=" + displaySize + ", ram=" + ram + ", brand=" + brand + "]";
	}

}

public class Prg1 {
	public static void main(String[] args) {
		System.out.println("main started");
		int a = 10;

		// an instance of a class
		// can be created with the help of new keyword
		Laptop swathi_laptop = new Laptop();

		System.out.println(swathi_laptop);
		System.out.println(swathi_laptop.ram);
		swathi_laptop.ram = 8;
		System.out.println(swathi_laptop.ram);
		System.out.println(swathi_laptop.brand);
		swathi_laptop.brand = "HP";
		System.out.println(swathi_laptop.brand);
		System.out.println(swathi_laptop.work());
		System.out.println(swathi_laptop);
		Laptop bhavith_laptop = new Laptop();
		System.out.println(bhavith_laptop);
		bhavith_laptop.ram = 16;
		bhavith_laptop.brand = "DELL";
		bhavith_laptop.displaySize = 15.6;
		System.out.println(bhavith_laptop);
		System.out.println("main ended");
	}
}
