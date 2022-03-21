package class10;

import java.util.Arrays;

public class Prg4 {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 2, -2, 5, 0, 1 };
		for (int swathi : array) {
			System.out.print(swathi+",");
		}
		System.out.println();
		System.out.println(Arrays.toString(array));
	}
}
