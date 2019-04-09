package emirim.inheritance;

public class GrandParent {
	public String name;
	public int age;
	
	public GrandParent(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}
	
	public void sleep(int time) {
		System.out.println(name + "할아버지가" + time + "시간 주무셨다.");
	}
	
	public void eat(String food) {
		System.out.println(name + "할아버지가 " + food + "를 드신다.");
	}
}
