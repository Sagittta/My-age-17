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
			
			 * System.out.print(" �й� : "+studentVO.getNumber());
			 * System.out.print(" ���� : "+studentVO.getName());
			 * System.out.print(" ���� : "+studentVO.getKorean()+"��");
			 * System.out.print(" ���� : "+studentVO.getEnglish()+"��");
			 * System.out.print(" ���� : "+studentVO.getMath()+"��");
			 * System.out.print(" ���� : "+studentVO.getHome()+"��");
			 * System.out.print(" ���� : "+studentVO.getHistory()+"��");
			 * System.out.print(" ���� : "+studentVO.getSum()+"��");
			 * System.out.println(" ��� : "+studentVO.getAverage()+"��");
			 
			System.out.println("�й�	����	����	����	����	����	����	����	��� ");
			System.out.println(""+studentVO.getNumber()+"	"+studentVO.getName()+"	"+studentVO.getKorean()+"	"+studentVO.getEnglish()+"	"+studentVO.getMath()+"	"+studentVO.getHome()+"	"+studentVO.getHistory()+"	"+studentVO.getSum()+"	"+studentVO.getAverage()+"");
			System.out.println("");
		}
		System.out.println("*********************************************************************");
	}*/
		public void inputStudentInfo(StudentDAO dao,Scanner s1, Scanner s2) {
			System.out.println("*****Student Score List*****");
			System.out.print("* �й� : ");
			int number = s1.nextInt();
			System.out.print("�̸� : ");
			String name = s2.nextLine();
			System.out.print("���� ����: ");
			int korean = s1.nextInt();
			System.out.print("���� ����: ");
			int english = s1.nextInt();
			System.out.print("���� ����: ");
			int math = s1.nextInt();
			System.out.print("���� ����: ");
			int home = s1.nextInt();
			System.out.print("���� ����: ");
			int history = s1.nextInt();
			dao.addStudent(new StudentVO(name, number, korean, english, math, home, history));
			
	}
		
		public void displayResult(StudentDAO dao) {
			ArrayList<StudentVO> vo = dao.getStudentList();
//			System.out.println("*****Student Score Result*****");
//			System.out.println("* �й� : "+student.getNumber()+" *");
//			System.out.println("* ���� : "+student.getName()+" *");
//			System.out.println("* ���� : "+student.getKorean()+" *");
//			System.out.println("* ����: "+student.getEnglish()+" *");
//			System.out.println("* ���� : "+student.getMath()+" *");
//			System.out.println("* ���� : "+student.getHome()+" *");
//			System.out.println("* ���� : "+student.getHistory()+" *");
//			System.out.println("* ���� : "+student.getSum()+" *");
//			System.out.println("* ��� : "+student.getAverage()+" *");
//			System.out.println("******************************");
			for (StudentVO studentVO : vo) {
			System.out.println("*************************Student Score List*************************");
			System.out.println("�й�	����	����	����	����	����	����	����	��� ");
			System.out.println(""+studentVO.getNumber()+"	"+studentVO.getName()+"	"+studentVO.getKorean()+"	"+studentVO.getEnglish()+"	"+studentVO.getMath()+"	"+studentVO.getHome()+"	"+studentVO.getHistory()+"	"+studentVO.getSum()+"	"+studentVO.getAverage()+"");
			System.out.println("*********************************************************************");
			}
		}
}

