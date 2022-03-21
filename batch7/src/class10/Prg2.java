package class10;

import java.util.Arrays;

public class Prg2 {

	public static void main(String[] args) {
		// 2-d array
		int[][] array2d = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 },{10,11,12,13,14} };
//	System.out.println(array2d[0][0]);
//	System.out.println(array2d[0][1]);
//	System.out.println(array2d[0][2]);
//	System.out.println(array2d[1][0]);
//	System.out.println(array2d[1][1]);
//	System.out.println(array2d[1][2]);
//	System.out.println(array2d[2][0]);
//	System.out.println(array2d[2][1]);
//	System.out.println(array2d[2][2]);
		//System.out.println(Arrays.toString(array2d[1]));
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(array2d[i][j] + ",");
			}
			System.out.println();
		}
	}

}
