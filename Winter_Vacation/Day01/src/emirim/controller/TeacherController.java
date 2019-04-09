package emirim.controller;

import java.util.ArrayList;

import emirim.teacher.Teacher;

public class TeacherController {

	public static void main(String[] args) {
	
		String[] names = {"±è¿µÃ¶", "ÀÌÃ¶È£", "½ÅÇýÁ¤"};
		int[] ages = {35, 40, 43};
		String[] hairColors = {"Mint", "Pink", "LightGold"};
		double[] heights = {174.3, 179.8, 165};
		int[] footSizes = {270, 280, 240};
		
		ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
		
		for (int i = 0; i < footSizes.length; i++) {
			Teacher teacher = new Teacher();
			teacher.setName(names[i]);
			teacher.setAge(ages[i]);
			teacher.setHairColor(hairColors[i]);
			teacher.setHeight(heights[i]);
			teacher.setFootSize(footSizes[i]);
			teacherList.add(teacher);
		}
		
		for (Teacher teacher : teacherList) {
			teacher.showInfo();
			teacher.sleep();
			teacher.eat();
			teacher.teach();
			teacher.watchingTV();
			teacher.developeCode();
		}
	}
	
}