//package emirim.bmi.gui;
//
//public class BMICalc implements BMIInter {
//	
//	@Override
//	public double calc(MenVO men) {
//		double weight = men.getWeight();	//MenVO(MenValueObject)�� ü���� ��ȯ����
//		double height = men.getHeight();	//Ű�� ��ȯ����
//		double bmi = weight/Math.pow(height/100, 2);	//m, n	m�� n������ ��
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
		double weight = men.getWeight(); //MenVO�� ü���� ��ȯ����
		double height = men.getHeight(); //MenVO�� Ű�� ��ȯ����
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