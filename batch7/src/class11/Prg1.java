package class11;

public class Prg1 {

	public static void main(String[] args) {
		
		//3 ways to create immutable strings 
		//1.way
		char[] nameArray=new char[]{'b','h','a','v','i','t','h'};
		//System.out.println(nameArray);
		String name1=new String(nameArray);
		System.out.println(name1);
		
		//2.way
		String s="bhavith";
		System.out.println(s);
		//3.way
		String ss=new String("bhavith");
		System.out.println(ss);
		ss.concat("sannidani");
		System.out.println(ss);
		
	}

}
