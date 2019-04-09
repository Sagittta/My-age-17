package emirim.bmi.console;

public interface BMIInter {
	public double calc(MenVO men);	//call by reference. 객체의 참조값을 받음.		call by value 는 double weight, int age 같은 거
	public String resultCom(double bmi);
}
//계획을 미리 설정해놓는 거임.