class Prg1{
	public static void main(String args[]){
		byte b=120;
		short s=1282;
		int i=12323;
		long l=234234234;
		System.out.printf("%d",b);
		System.out.println(" Byte:"+Byte.SIZE/8);
		System.out.println(s+"\n "+Short.SIZE);
		System.out.println(i+" "+Integer.SIZE);
		System.out.println(l+" "+Long.SIZE);
	}
}