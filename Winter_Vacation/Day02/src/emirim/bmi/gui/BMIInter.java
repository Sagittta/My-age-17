//package emirim.bmi.gui;
//
//public interface BMIInter {
//	public double calc(MenVO men);	//call by reference. 객체의 참조값을 받음.		call by value 는 double weight, int age 같은 거
//	public String resultCom(double bmi);
//}
//계획을 미리 설정해놓는 거임.
package emirim.bmi.gui;

public interface BMIInter {
	public double calc(MenVO men); //double height, double weight
	public String resultPath(double bmi);
}