package class10;

public class Prg3 {

	public static void main(String[] args) {
		int[][] array2d = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				System.out.print(i + "," + j + "  ");
			}
			System.out.println();
		}
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (i == j)
					System.out.print(array2d[i][j] + ",");

			}
		}
		System.out.println();
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (i + j == array2d.length - 1)
					System.out.print(+ array2d[i][j] + ",");
			}
		}
	}
}
