package class14;

public class Human {
	private String name;
	private int age;
	private String bloodGroup;
	private char sex;
	private float height;
	private float weight;

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", bloodGroup=" + bloodGroup + ", sex=" + sex + ", height="
				+ height + ", weight=" + weight + "]";
	}

	public Human(String name, int age, String bloodGroup, char sex, float height, float weight) {
		super();
		this.name = name;
		this.age = age;
		this.bloodGroup = bloodGroup;
		this.sex = sex;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

}
