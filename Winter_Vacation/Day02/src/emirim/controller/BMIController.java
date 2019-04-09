package emirim.controller;

import emirim.bmi.console.BMICalc;
import emirim.bmi.console.BMIView;
import emirim.bmi.console.MenVO;

public class BMIController {

	public static void main(String[] args) {
		MenVO men = new MenVO();
		BMIView view = new BMIView(men);	//1. 값을 저장하는 객체(view) 생성.
		view.inputInfo();		//2. 콘솔에서 입력받기 ?
		BMICalc cal = new BMICalc();		//3. 계산하는 클래스 BMICalc의 객체 생성.
		double bmi = cal.calc(men);		//double형으로 return 해준 계산값을 bmi 변수에 넣음.
		String com = cal.resultCom(bmi);
		view.setBmi(bmi);
		view.setResultCom(com);		//4. 결과 코멘트를 저장
		view.showInfo();		//5. 출력~~~
	}

}
