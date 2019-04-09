package emirim.inheritance;

public class Child extends Parent {
	public String schoolName;

	public Child(String name, int age, double weight, double height, String schoolName) {
		super(name, age, weight, height);
		// TODO Auto-generated constructor stub
		this.schoolName = schoolName;
	}
	
	public void study(String subject) {
		System.out.println(subject + "��(��) ������ �����Ѵ�.");
	}
	
	@Override
	public void dance(String type) {
		// TODO Auto-generated method stub
		super.dance("��ũ��");
		System.out.println(type + "���� Ŭ������ ������ ���.");
	}
}
