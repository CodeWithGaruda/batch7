package class9;

import java.util.Scanner;

public class Prg2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the size of array:");
		
		int size=scan.nextInt();
		int[] array = new int[size];
		System.out.println("enter "+size+" values:");
		
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}

		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

}
