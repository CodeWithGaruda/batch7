package class13;

class Duster{
	String color;
}
public class Prg3 {
	public static void main(String[] args) {
		int a,b;
		a=20;
		b=a;
		System.out.println(a);
		System.out.println(b);
		a=2000;
		System.out.println(a);//2000
		System.out.println(b);//20
		a=b;
		System.out.println(a);//20
		System.out.println(b);//20
		//---------------------------
		Duster d1=new Duster();
		d1.color="pink";
		Duster d2=d1;
		System.out.println(d1.color);//pink
		System.out.println(d2.color);//pink
		d1.color="orange";
		System.out.println(d1.color);//orange
		System.out.println(d2.color);//pink
		
		
	}
}
