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
//		JPanel panNorth = new JPanel(new GridLayout(3, 1));	//3�� 1���� ���ڸ� ����. JPanel�� ���� ����
////		JPanel pan1 = new JPanel();
////		JPanel pan2 = new JPanel();
////		JPanel pan3 = new JPanel();
////		panNorth.add(pan1);
////		panNorth.add(pan2);
////		panNorth.add(pan3);
//		JLabel lblName = new JLabel("* ����: ");
//		JLabel lblWeight = new JLabel("* ü��: ");
//		JLabel lblHeight = new JLabel("* ����: ");		//JLabel �� ���� : �� �� �� '���� : '�� ����.
//		ImageIcon icon = new ImageIcon("imgs/bmi_logo.gif");	//label�� �̹��� ����
//		JLabel lblResult = new JLabel(icon);		//icon �ҷ���
//		JTextField textName = new JTextField(10);		//���� 10�� ���� �� ������ ũ��. ���� : �� �� �� '��'�� ����.
//		JTextField textWeight = new JTextField(10);
//		JTextField textHeight = new JTextField(10);
//		JButton btnResult = new JButton("���");			//��ư
//		panNorth.add(lblName);
//		panNorth.add(textName);
//		panNorth.add(lblWeight);
//		panNorth.add(textWeight);
//		panNorth.add(lblHeight);
//		panNorth.add(textHeight);
//		panNorth.add(btnResult);
//		
//		add(panNorth, "North");		//panNorth�� jframe North�κп� �߰�(��ġ ������ ���� �� ���� �빮��)
//		add(lblResult, "Center");	//Center�� ���� ����.
//		
//		setTitle("ü��������");
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
		JLabel lblName = new JLabel("* ���� : ");
		JLabel lblWeight = new JLabel("* ü�� : ");
		JLabel lblHeight = new JLabel("* ���� : ");
		ImageIcon icon = new ImageIcon("imgs/bmi_logo.gif");
		JLabel lblResult = new JLabel(icon);
		JTextField textName = new JTextField(10);
		JTextField textWeight = new JTextField(10);
		JTextField textHeight = new JTextField(10);
		JButton btnResult = new JButton("���");
		btnResult.addActionListener(new BtnHandler(textName, textWeight, textHeight, lblResult));
		panNorth.add(lblName);
		panNorth.add(textName);
		panNorth.add(lblWeight);
		panNorth.add(textWeight);
		panNorth.add(lblHeight);
		panNorth.add(textHeight);
		panNorth.add(btnResult);
		setTitle("ü��������");
		
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