package class10;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] array=new int[] {3,2,-2,5,0,1};
		System.out.print("enter a value to find in array:");
		int find=scan.nextInt();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==find)
				System.out.println("at indext:"+i);
		}
		
	}

}
