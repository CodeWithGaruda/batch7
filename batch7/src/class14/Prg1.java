package class14;

/**
 * encapsulation
 * 
 * restricting the direct access of data and accessing the data indirectly with
 * controlled access
 * 
 * wrapping the data in a single entity
 *
 */
class Mobile {
	private int cameraMp=13;
	private String brand="realMe";
	private double displaySize=6.5;

	void setCameraMp(int cameraMp) {
		this.cameraMp = cameraMp;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setDisplaySize(double displaySize) {
		this.displaySize = displaySize;
	}

	int getCameraMp() {
		return cameraMp;
	}

	String getBrand() {
		return brand;
	}

	double getDisplaySize() {
		return displaySize;
	}

	@Override
	public String toString() {
		return "Mobile [cameraMp=" + cameraMp + ", brand=" + brand + ", displaySize=" + displaySize + "]";
	}

}

public class Prg1 {
	public static void main(String[] args) {
		Mobile bhavith_mobile = new Mobile();

		bhavith_mobile.setCameraMp(12);
		bhavith_mobile.setBrand("IPhone");
		bhavith_mobile.setDisplaySize(6.1);

		System.out.println(bhavith_mobile);
		
		Mobile sanath=new Mobile();
		System.out.println(sanath);
	}
}
