package emirim.inheritance;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		// TODO Auto-generated constructor stub
		setTitle("집중력 높은 미림정보과학고 학생들");
		setDefaultCloseOperation(EXIT_ON_CLOSE);	//오른쪽 위 x누르면 프로그램 끝나는 거
		setSize(500, 300);	//픽셀 단위. 윈도우 창 크기래
		setLocation(200, 150);	//화면에 나타나는 위치
		setVisible(true);	//true로 설정해야 보인다
	}		//상속받았기 때문에 가능 ^^

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}

}
