package emirim.bmi.console;

public class BMICalc implements BMIInter {
	
	@Override
	public double calc(MenVO men) {
		double weight = men.getWeight();	//MenVO(MenValueObject)�� ü���� ��ȯ����
		double height = men.getHeight();	//Ű�� ��ȯ����
		double bmi = weight/Math.pow(height/100, 2);	//m, n	m�� n������ ��
		return bmi;
	}

	@Override
	public String resultCom(double bmi) {
		String result = "";
		if (bmi < 18.5)
			result = "��ü��";
		else if (bmi < 25)
			result = "����";
		else if (bmi < 30)
			result = "��ü��";
		else
			result = "��";
		return result;
	}

}
