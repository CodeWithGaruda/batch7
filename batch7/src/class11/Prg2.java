package class11;

public class Prg2 {

	public static void main(String[] args) {
		String name1="bhavith";
		String name2="bhavith";
		System.out.println(name1==name2);
		
		String name11=new String("bhavith");
		String name22=new String("bhavith");
		System.out.println(name11==name22);
		
		// when u equate with == it will compare addresses
		
		System.out.println(name1.equals(name2));
		System.out.println(name11.equals(name22));
	}

}
