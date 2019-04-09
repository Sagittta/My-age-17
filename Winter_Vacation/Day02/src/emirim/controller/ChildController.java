package emirim.controller;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.inheritance.Child;

public class ChildController {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);	//String type.
		Scanner s2 = new Scanner(System.in);	//Number type.
		ArrayList<Child> cList = new ArrayList<Child>();
		while (true) {
			System.out.println("*****************************");
			System.out.println("���ڳ� ������ �Է��� �ּ���.");
			System.out.print("�� ���� : ");
			String name = s1.nextLine();
			System.out.print("�� ���� : ");
			int age = s2.nextInt();
			System.out.print("�� ü�� : ");
			double weight = s2.nextDouble();
			System.out.print("�� Ű : ");
			double height = s2.nextDouble();
			System.out.println("�� �б� �̸� : ");
			String schoolName = s1.nextLine();
			System.out.println("*****************************");
			System.out.println("�� �Է��� ����Ͻðڽ��ϱ�? (y/n)");
			String end = s1.nextLine();
			if (end.equals("n") || end.contentEquals("N"))
				break;
			
			Child c = new Child(name, age, weight, height, schoolName);
			cList.add(c);
		}
		
		for (Child child : cList) {
			System.out.println(child.name + "�Դϴ�.");
			System.out.println(child.age + "�� �Դϴ�.");
			child.dance("���ô�");
			child.play("���Ǿ�");
		}
		
		s1.close();
		s2.close();
	}

}
