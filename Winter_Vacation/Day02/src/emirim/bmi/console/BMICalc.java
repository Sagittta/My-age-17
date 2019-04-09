package emirim.bmi.console;

public class BMICalc implements BMIInter {
	
	@Override
	public double calc(MenVO men) {
		double weight = men.getWeight();	//MenVO(MenValueObject)의 체중을 반환받음
		double height = men.getHeight();	//키를 반환받음
		double bmi = weight/Math.pow(height/100, 2);	//m, n	m을 n승으로 함
		return bmi;
	}

	@Override
	public String resultCom(double bmi) {
		String result = "";
		if (bmi < 18.5)
			result = "저체중";
		else if (bmi < 25)
			result = "정상";
		else if (bmi < 30)
			result = "과체중";
		else
			result = "비만";
		return result;
	}

}
