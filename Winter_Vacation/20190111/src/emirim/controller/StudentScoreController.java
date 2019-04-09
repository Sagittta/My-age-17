package emirim.controller;
import java.util.Scanner;

import emirim.domain.StudentVO;
import emirim.persistence.StudentDAO;
import emirim.view.ScoreView;

public class StudentScoreController {

	public static void main(String[] args) {
//		int[] numbers = {1301,1318,1309,1317,1310};
//		String[] names = {"장원이", "차학연", "정택운", "이재환", "김원식"};
//		int[] koreans = {100, 75, 85, 95, 88 };
//		int[] englishs = {66, 77, 56, 86, 54};
//		int[] maths = {43, 66, 74, 98, 77};
//		int[] homes = {55, 100, 99, 64, 93};
//		int[] historys = {59, 78, 82, 66, 69};
//		
//		StudentDAO dao = new StudentDAO();
//		for (int i = 0; i < historys.length; i++) {
//			dao.addStudent(new StudentVO(names[i], numbers[i], koreans[i], englishs[i], maths[i], homes[i], historys[i]));
//		}
//		
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		StudentDAO dao = new StudentDAO();
		ScoreView view = new ScoreView();
		while(true) {
			view.inputStudentInfo(dao, s1, s2);
			System.out.println("* 계속 정보를 입력하시겠습니까? (y/n) : ");
			String s = s2.nextLine();
			if(s.equals("n") || s.equals("N")) {
				break;
			}
		}
		view.displayResult(dao);
		s1.close();
		s2.close();
//		ScoreView view = new ScoreView();
//		view.displayResult(dao);
	}
}
