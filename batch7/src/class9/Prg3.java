package class9;

public class Prg3 {

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 30, 40, 50, 60 };
		// sum of all elements in array
		int res = 0;
		for (int i = 0; i < array.length; i++) {
			res = res + array[i];
		}
		System.out.println(res);
	}

}
