package class14;

class Fan {
	private int wings;
	private String brand;

	Fan(int wings, String brand) {
		this.wings = wings;
		this.brand = brand;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWings() {
		return wings;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Fan [wings=" + wings + ", brand=" + brand + "]";
	}

}

public class Swathi {
	public static void main(String[] args) {
		Fan f = new Fan(3, "usha");
		Fan ff = new Fan(4, "swathi");
		System.out.println(ff);
		System.out.println(f);
		ff.setBrand("bhavith");
		System.out.println(ff);
		System.out.println(ff.getBrand());

		Books book = new Books(500, "pythonForDummies", "swathi", 1000000, "pythonProgramming", 5, 2020, "india", 10000000);
		System.out.println(book.getCost());
	}

}
