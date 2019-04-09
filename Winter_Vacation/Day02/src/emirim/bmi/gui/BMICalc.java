//package emirim.bmi.gui;
//
//public class BMICalc implements BMIInter {
//	
//	@Override
//	public double calc(MenVO men) {
//		double weight = men.getWeight();	//MenVO(MenValueObject)의 체중을 반환받음
//		double height = men.getHeight();	//키를 반환받음
//		double bmi = weight/Math.pow(height/100, 2);	//m, n	m을 n승으로 함
//		return bmi;
//	}
//
//	@Override
//	public String resultPath(double bmi) {
//		String result = "";
//		if (bmi < 18.5)
//			result = "bmi1";
//		else if (bmi < 25)
//			result = "bmi2";
//		else if (bmi < 30)
//			result = "bmi3";
//		else
//			result = "bmi4";
//		return result;
//	}
//
//}
package emirim.bmi.gui;

public class BMICalc implements BMIInter {
	
	@Override
	public double calc(MenVO men) {
		double weight = men.getWeight(); //MenVO의 체중을 반환받음
		double height = men.getHeight(); //MenVO의 키를 반환받음
		double bmi = weight/Math.pow(height/100, 2);
		return bmi;
	}

	@Override
	public String resultPath(double bmi) {
		String result="";
		if(bmi<18.5)
			result="bmi1";
		else if(bmi<25)
			result = "bmi2";
		else if(bmi<30)
			result = "bmi3";
		else
			result="bmi4";
		return result;
	}

}