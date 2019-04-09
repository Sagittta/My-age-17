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
			System.out.println("◎자녀 정보를 입력해 주세요.");
			System.out.print("◎ 성명 : ");
			String name = s1.nextLine();
			System.out.print("◎ 나이 : ");
			int age = s2.nextInt();
			System.out.print("◎ 체중 : ");
			double weight = s2.nextDouble();
			System.out.print("◎ 키 : ");
			double height = s2.nextDouble();
			System.out.println("◎ 학교 이름 : ");
			String schoolName = s1.nextLine();
			System.out.println("*****************************");
			System.out.println("◎ 입력을 계속하시겠습니까? (y/n)");
			String end = s1.nextLine();
			if (end.equals("n") || end.contentEquals("N"))
				break;
			
			Child c = new Child(name, age, weight, height, schoolName);
			cList.add(c);
		}
		
		for (Child child : cList) {
			System.out.println(child.name + "입니다.");
			System.out.println(child.age + "세 입니다.");
			child.dance("셔플댄스");
			child.play("마피아");
		}
		
		s1.close();
		s2.close();
	}

}
