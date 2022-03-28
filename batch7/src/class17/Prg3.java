package class17;

final class Bhavith{
	void sample() {
		System.out.println("this is sample method form final bhavith class");
	}
}
//u cant extend a class when its declared as final
//class Alp extends Bhavith{
//	
//}
class Swathi{
	final float PI=3.14257f;
	final void sample() {
		System.out.println("this is my method and u cant change it");
	}

	void sample(int a) {

	}

	void temp() {
		System.out.println("temp method");
	}
}
class B extends Swathi{
	//u cant over ride a method when its declared as final
	@Override
	void temp() {
		System.out.println("i can change it :P");
	}
}
public class Prg3 {
	public static void main(String[] args) {
		B b=new B();
		b.sample();
	}

}
