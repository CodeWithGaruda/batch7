package class17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prg5 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\test\\Desktop\\JAVA.txt"));
		System.out.println("file located");
		System.out.println(reader.readLine());
		String line="";
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
	}

}
