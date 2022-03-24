package class13;

class Human{
	int instance=21;
	void info() {
		int local=10;
		System.out.println(local);
	}
}

public class Prg2 {
	static Human sanath;
	public static void main(String[] args) {
		Human bhavith=new Human();
		System.out.println(bhavith.instance);//21
		bhavith.info();
		
		System.out.println(sanath);
		sanath=new Human();//@2020
		System.out.println(sanath);
		sanath.instance=24;
		System.out.println(sanath.instance);
		sanath=null;
		System.out.println(sanath);
		
	}
}
