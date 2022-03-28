package class17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prg4 {
	public static void main(String[] args) throws IOException {
		BufferedWriter writer=new BufferedWriter(new FileWriter("bhavith.txt"));
		Scanner scan = new Scanner(System.in);
		String name;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("* ");
				writer.write("* ");
			}
			writer.write("\n");
			System.out.println();
		}
		
		//writer.write("this is bhavith file and i have written it from java program");
		System.out.println("file is created successfully");
		writer.close();
	}		
}
