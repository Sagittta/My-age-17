package emirim.inheritance;

public class Child extends Parent {
	public String schoolName;

	public Child(String name, int age, double weight, double height, String schoolName) {
		super(name, age, weight, height);
		// TODO Auto-generated constructor stub
		this.schoolName = schoolName;
	}
	
	public void study(String subject) {
		System.out.println(subject + "을(를) 열심히 공부한다.");
	}
	
	@Override
	public void dance(String type) {
		// TODO Auto-generated method stub
		super.dance("포크댄스");
		System.out.println(type + "춤을 클럽에서 멋지게 춘다.");
	}
}
