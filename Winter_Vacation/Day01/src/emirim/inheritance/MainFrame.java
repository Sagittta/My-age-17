package emirim.inheritance;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		setTitle("���߷� ���� �̸��������а� �л���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//������ �� x������ ���α׷� ������ ��
		setSize(500, 300);	//�ȼ� ����. ������ â ũ�ⷡ
		setLocation(200, 150);	//ȭ�鿡 ��Ÿ���� ��ġ
		setVisible(true);	//true�� �����ؾ� ���δ�
	}		//��ӹ޾ұ� ������ ���� ^^

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}

}
