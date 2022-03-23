package class11;

public class Prg6 {

	public static void main(String[] args) {
		StringBuffer b=new StringBuffer();
		System.out.println(b.capacity());
		// mutable strings
		StringBuffer buffer = new StringBuffer("bhavith");
		StringBuilder builder = new StringBuilder("bhavith");
		System.out.println(buffer.capacity());
		System.out.println(builder.capacity());
		buffer.append(" sannidani");
		System.out.println(buffer);
		builder.append(" sannidani");
		System.out.println(builder);
		
		System.out.println(builder.length());
		
		System.out.println(buffer.capacity());
		System.out.println(builder.capacity());
		builder.append(" sannidani");
		buffer.append(" sannidani");

		System.out.println(buffer.capacity());
		System.out.println(builder.capacity());
		
		buffer.delete(17, buffer.length());
		System.out.println(buffer);
		
	}

}
