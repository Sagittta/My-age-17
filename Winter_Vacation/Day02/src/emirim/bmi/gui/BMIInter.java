//package emirim.bmi.gui;
//
//public interface BMIInter {
//	public double calc(MenVO men);	//call by reference. ��ü�� �������� ����.		call by value �� double weight, int age ���� ��
//	public String resultCom(double bmi);
//}
//��ȹ�� �̸� �����س��� ����.
package emirim.bmi.gui;

public interface BMIInter {
	public double calc(MenVO men); //double height, double weight
	public String resultPath(double bmi);
}