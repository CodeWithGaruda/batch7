package class14;

class Point {
	private int x;
	private int y;
	private String name;
	//non-parameterized
	Point(){
		
	}
	/**
	 * constructor is a special type of setter method which is having same name as class name
	 * it takes the parameters and u can assign them to your instance variables
	 */
	//parameterized
	Point(int x,int y,String name){
		this.x=x;
		this.y=y;
		this.name=name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + ", name=" + name + "]";
	}
	
}

public class Prg2 {
	public static void main(String[] args) {
		Point p=new Point(1,2,"bhavith");
		System.out.println(p);
		p.setName("point");
		System.out.println(p);
		System.out.println(p.getName());
		
		Human sanath=new Human("sanath rayala", 24, "b+", 'm', 5.6f, 65.4f);
		System.out.println(sanath);
		
	}
}
