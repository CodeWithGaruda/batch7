package class17;

class Parent{
	
	protected void  house() {
		System.out.println("i have a house");
	}
}
class Child extends Parent{
	//1.u can't decrease the visibility of the over ridden members
	//2.return type should be same in over-ridden method
	@Override
	public void house() {
		System.out.println("i changed the house to banglow");
	}
}

public class Prg2 {
	public static void main(String[] args) {
		Child swathi=new Child();
		swathi.house();
	}
}
