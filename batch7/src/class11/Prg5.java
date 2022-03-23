package class11;

public class Prg5 {

	public static void main(String[] args) {
		String name = "bhavith sannidhani khammam.swathi sbit";
		String[] array=name.split("\\.");
//		for(int i=0;i<array.length;i++) {
//			System.out.println(array[i]);
//		}
		for(int i=array.length-1;i>=0;i--) {
			System.out.println(array[i]);
		}
		System.out.println(array.length);
	}

}
