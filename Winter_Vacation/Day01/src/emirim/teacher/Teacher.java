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
		System.out.println(name + "선생님이 학생들을 가르친다");
	}
	
	public void sleep() {
		System.out.println(age+"살의 선생님이 잔다");
	}
	
	public void eat() {
		System.out.println(name + "선생님이 먹는다");
	}
	
	public void watchingTV() {
		System.out.println(name + "선생님이 SKY캐슬을 본다.");
	}
	
	public void developeCode() {
		System.out.println(name+"선생님이 코딩한다");
	}
	
	public void showInfo() {
		System.out.println("**************************");
		System.out.println("** 성명: " + name);
		System.out.println("** 신발사이즈: " + footSize);
		System.out.println("** 머리색: " + hairColor);
		System.out.println("** 나이: " + age + "세");
		System.out.println("** 키: " + height + "cm");
		System.out.println("**************************");
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", footSize=" + footSize + ", age=" + age + ", hairColor=" + hairColor
				+ ", height=" + height + "]";
	}
}
