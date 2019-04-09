package emirim.view;
import java.util.ArrayList;
import java.util.Scanner;
import emirim.domain.StudentVO;
import emirim.domain.StudentVO;
import emirim.persistence.StudentDAO;

public class ScoreView {
	/*public void displayResult(StudentDAO dao) {*/
		/*ArrayList<StudentVO> studentList = dao.getStudentList();
		System.out.println("*************************Student Score List*************************");
		System.out.println("");
		for (StudentVO studentVO : studentList) {
			
			 * System.out.print(" 학번 : "+studentVO.getNumber());
			 * System.out.print(" 성명 : "+studentVO.getName());
			 * System.out.print(" 국어 : "+studentVO.getKorean()+"점");
			 * System.out.print(" 영어 : "+studentVO.getEnglish()+"점");
			 * System.out.print(" 수학 : "+studentVO.getMath()+"점");
			 * System.out.print(" 가정 : "+studentVO.getHome()+"점");
			 * System.out.print(" 국사 : "+studentVO.getHistory()+"점");
			 * System.out.print(" 총점 : "+studentVO.getSum()+"점");
			 * System.out.println(" 평균 : "+studentVO.getAverage()+"점");
			 
			System.out.println("학번	성명	국어	영어	수학	가정	국사	총점	평균 ");
			System.out.println(""+studentVO.getNumber()+"	"+studentVO.getName()+"	"+studentVO.getKorean()+"	"+studentVO.getEnglish()+"	"+studentVO.getMath()+"	"+studentVO.getHome()+"	"+studentVO.getHistory()+"	"+studentVO.getSum()+"	"+studentVO.getAverage()+"");
			System.out.println("");
		}
		System.out.println("*********************************************************************");
	}*/
		public void inputStudentInfo(StudentDAO dao,Scanner s1, Scanner s2) {
			System.out.println("*****Student Score List*****");
			System.out.print("* 학번 : ");
			int number = s1.nextInt();
			System.out.print("이름 : ");
			String name = s2.nextLine();
			System.out.print("국어 점수: ");
			int korean = s1.nextInt();
			System.out.print("영어 점수: ");
			int english = s1.nextInt();
			System.out.print("수학 점수: ");
			int math = s1.nextInt();
			System.out.print("가정 점수: ");
			int home = s1.nextInt();
			System.out.print("국사 점수: ");
			int history = s1.nextInt();
			dao.addStudent(new StudentVO(name, number, korean, english, math, home, history));
			
	}
		
		public void displayResult(StudentDAO dao) {
			ArrayList<StudentVO> vo = dao.getStudentList();
//			System.out.println("*****Student Score Result*****");
//			System.out.println("* 학번 : "+student.getNumber()+" *");
//			System.out.println("* 성명 : "+student.getName()+" *");
//			System.out.println("* 국어 : "+student.getKorean()+" *");
//			System.out.println("* 영어: "+student.getEnglish()+" *");
//			System.out.println("* 수학 : "+student.getMath()+" *");
//			System.out.println("* 가정 : "+student.getHome()+" *");
//			System.out.println("* 국사 : "+student.getHistory()+" *");
//			System.out.println("* 총점 : "+student.getSum()+" *");
//			System.out.println("* 평균 : "+student.getAverage()+" *");
//			System.out.println("******************************");
			for (StudentVO studentVO : vo) {
			System.out.println("*************************Student Score List*************************");
			System.out.println("학번	성명	국어	영어	수학	가정	국사	총점	평균 ");
			System.out.println(""+studentVO.getNumber()+"	"+studentVO.getName()+"	"+studentVO.getKorean()+"	"+studentVO.getEnglish()+"	"+studentVO.getMath()+"	"+studentVO.getHome()+"	"+studentVO.getHistory()+"	"+studentVO.getSum()+"	"+studentVO.getAverage()+"");
			System.out.println("*********************************************************************");
			}
		}
}

