package class11;

public class Prg7 {

	public static void main(String[] args) {
		String s="Raja Ram Mohan Roy";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("Raja"));
		System.out.println(s.endsWith("Raja"));
		System.out.println(s.contains("Mohan"));
		
		String ss="Raja ram mohan Roy";
		System.out.println(s.equalsIgnoreCase(ss));
		
		
		StringBuffer buffer=new StringBuffer("oppo");
		System.out.println(buffer.reverse());
		
		if(buffer.reverse().equals(buffer)) {
			System.out.println("pallindrome");
		}
		
	}

}
