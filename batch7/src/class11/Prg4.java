package class11;

public class Prg4 {

	public static void main(String[] args) {
		// length,charAt()

		// reverse of a string
		String name = "bhavith";
		System.out.println(name);
		for (int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		System.out.println();

		// lowerCase to upperCase
		for (int i = 0; i < name.length(); i++) {
			System.out.print((char) (name.charAt(i) - 32));
		}
		System.out.println();
		
		// pallindrome
		String pal = "oppo";
		String res = "";
		for (int i = pal.length() - 1; i >= 0; i--) {
			res = res + pal.charAt(i);
		}
		if (res.equals(pal)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		//no of words in the given string
		String para="my name is swathi and iam very intelligent";
		int count=0;
		for(int i=0;i<para.length();i++) {
			if(para.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);
		
	}

}



















