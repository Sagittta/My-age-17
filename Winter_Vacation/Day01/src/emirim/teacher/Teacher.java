package emirim.teacher;

public class Teacher {
	private String name;
	private int footSize;
	private int age;
	private String hairColor;
	private double height;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFootSize() {
		return footSize;
	}

	public void setFootSize(int footSize) {
		this.footSize = footSize;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void teach() {
		System.out.println(name + "�������� �л����� ����ģ��");
	}
	
	public void sleep() {
		System.out.println(age+"���� �������� �ܴ�");
	}
	
	public void eat() {
		System.out.println(name + "�������� �Դ´�");
	}
	
	public void watchingTV() {
		System.out.println(name + "�������� SKYĳ���� ����.");
	}
	
	public void developeCode() {
		System.out.println(name+"�������� �ڵ��Ѵ�");
	}
	
	public void showInfo() {
		System.out.println("**************************");
		System.out.println("** ����: " + name);
		System.out.println("** �Ź߻�����: " + footSize);
		System.out.println("** �Ӹ���: " + hairColor);
		System.out.println("** ����: " + age + "��");
		System.out.println("** Ű: " + height + "cm");
		System.out.println("**************************");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", footSize=" + footSize + ", age=" + age + ", hairColor=" + hairColor
				+ ", height=" + height + "]";
	}
}
