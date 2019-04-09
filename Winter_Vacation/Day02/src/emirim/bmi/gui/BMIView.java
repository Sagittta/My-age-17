//package emirim.bmi.gui;
//
//import java.awt.GridLayout;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//
//public class BMIView extends JFrame {
//	
//	public BMIView() {
//		JPanel panNorth = new JPanel(new GridLayout(3, 1));	//3행 1열로 상자를 만듦. JPanel이 상자 역할
////		JPanel pan1 = new JPanel();
////		JPanel pan2 = new JPanel();
////		JPanel pan3 = new JPanel();
////		panNorth.add(pan1);
////		panNorth.add(pan2);
////		panNorth.add(pan3);
//		JLabel lblName = new JLabel("* 성명: ");
//		JLabel lblWeight = new JLabel("* 체중: ");
//		JLabel lblHeight = new JLabel("* 신장: ");		//JLabel 은 성명 : ㅁ 일 때 '성명 : '을 말함.
//		ImageIcon icon = new ImageIcon("imgs/bmi_logo.gif");	//label에 이미지 설정
//		JLabel lblResult = new JLabel(icon);		//icon 불러옴
//		JTextField textName = new JTextField(10);		//글자 10개 정도 들어갈 상자의 크기. 성명 : ㅁ 일 때 'ㅁ'를 말함.
//		JTextField textWeight = new JTextField(10);
//		JTextField textHeight = new JTextField(10);
//		JButton btnResult = new JButton("결과");			//버튼
//		panNorth.add(lblName);
//		panNorth.add(textName);
//		panNorth.add(lblWeight);
//		panNorth.add(textWeight);
//		panNorth.add(lblHeight);
//		panNorth.add(textHeight);
//		panNorth.add(btnResult);
//		
//		add(panNorth, "North");		//panNorth를 jframe North부분에 추가(위치 지정할 때는 앞 글자 대문자)
//		add(lblResult, "Center");	//Center는 생략 가능.
//		
//		setTitle("체질량지수");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setSize(600, 500);
//		setVisible(true);
//	}
//	
//	public static void main(String[] args) {
//		new BMIView();
//	}
//	
//}
package emirim.bmi.gui;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BMIView extends JFrame {
	
	public BMIView() {
		getContentPane().setBackground(Color.PINK);
		JPanel panNorth = new JPanel();
		panNorth.setBackground(Color.WHITE);
		//JPanel panNorth = new JPanel(new GridLayout(3, 1));
		//JPanel pan1 = new JPanel();
		//JPanel pan2 = new JPanel();
		//JPanel pan3 = new JPanel();
		//panNorth.add(pan1);
		//panNorth.add(pan2);
		//panNorth.add(pan3);
		JLabel lblName = new JLabel("* 성명 : ");
		JLabel lblWeight = new JLabel("* 체중 : ");
		JLabel lblHeight = new JLabel("* 신장 : ");
		ImageIcon icon = new ImageIcon("imgs/bmi_logo.gif");
		JLabel lblResult = new JLabel(icon);
		JTextField textName = new JTextField(10);
		JTextField textWeight = new JTextField(10);
		JTextField textHeight = new JTextField(10);
		JButton btnResult = new JButton("결과");
		btnResult.addActionListener(new BtnHandler(textName, textWeight, textHeight, lblResult));
		panNorth.add(lblName);
		panNorth.add(textName);
		panNorth.add(lblWeight);
		panNorth.add(textWeight);
		panNorth.add(lblHeight);
		panNorth.add(textHeight);
		panNorth.add(btnResult);
		setTitle("체질량지수");
		
		add(panNorth, "North");
		add(lblResult, "Center");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setVisible(true);
		setLocation(200, 200); 
	}

	public static void main(String[] args) {
		new BMIView();
	}
	
}