package emirim.inheritance;

public class Parent extends GrandParent {
	double weight;
	double height;

	public Parent(String name, int age, double weight, double height) {
		super(name, age);	//부모의 기본 생성자가 없을 경우에 사용, 상속관계에서 부모의 객체가 생성될 때 호출되는 생성자는 기본생성자이기 때문
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.height = height;
	}
	
	public void play(String type) {
		System.out.println(type + "을 하면서 행복하게 논다.");
	}
	
	public void dance(String type) {
		System.out.println(type + " 춤을 춘다.");
	}
	
	public void talk() {
		System.out.println("자녀들 자랑하는 이야기를 나눈다.");
	}
}
