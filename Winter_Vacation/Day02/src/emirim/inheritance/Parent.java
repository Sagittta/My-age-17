package emirim.inheritance;

public class Parent extends GrandParent {
	double weight;
	double height;

	public Parent(String name, int age, double weight, double height) {
		super(name, age);	//�θ��� �⺻ �����ڰ� ���� ��쿡 ���, ��Ӱ��迡�� �θ��� ��ü�� ������ �� ȣ��Ǵ� �����ڴ� �⺻�������̱� ����
		// TODO Auto-generated constructor stub
		this.weight = weight;
		this.height = height;
	}
	
	public void play(String type) {
		System.out.println(type + "�� �ϸ鼭 �ູ�ϰ� ���.");
	}
	
	public void dance(String type) {
		System.out.println(type + " ���� ���.");
	}
	
	public void talk() {
		System.out.println("�ڳ�� �ڶ��ϴ� �̾߱⸦ ������.");
	}
}
