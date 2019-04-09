package emirim.controller;

import emirim.bmi.console.BMICalc;
import emirim.bmi.console.BMIView;
import emirim.bmi.console.MenVO;

public class BMIController {

	public static void main(String[] args) {
		MenVO men = new MenVO();
		BMIView view = new BMIView(men);	//1. ���� �����ϴ� ��ü(view) ����.
		view.inputInfo();		//2. �ֿܼ��� �Է¹ޱ� ?
		BMICalc cal = new BMICalc();		//3. ����ϴ� Ŭ���� BMICalc�� ��ü ����.
		double bmi = cal.calc(men);		//double������ return ���� ��갪�� bmi ������ ����.
		String com = cal.resultCom(bmi);
		view.setBmi(bmi);
		view.setResultCom(com);		//4. ��� �ڸ�Ʈ�� ����
		view.showInfo();		//5. ���~~~
	}

}
