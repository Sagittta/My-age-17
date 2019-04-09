package emirim.view;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import emirim.domain.MovieVO;
import emirim.handler.BtnSelectHandler;
import emirim.persistence.MovieDAO;

public class MovieInfoView extends JFrame {

	private MovieDAO dao;
	private int selectedIndex;
	private JButton btnSelect = new JButton("����");
	private JButton btnCancle = new JButton("���");
	private MovieReservationView mainView;
	
	public MovieInfoView(MovieReservationView mainView, MovieDAO dao, int selectedIndex) {
		this.dao = dao;
		this.selectedIndex = selectedIndex;
		this.mainView = mainView;
		setLayout(new GridLayout(1, 3));
		displayInfo();
		setTitle("������ ��ȭ ����");
		setBounds(170, 70, 500, 300);
		setVisible(true);
	}
	
	public JButton getBtnSelect() {
		return btnSelect;
	}



	public JButton getBtnCancle() {
		return btnCancle;
	}
	
	public void displayInfo( ) {
		ArrayList<MovieVO> mList = dao.getMovieList();
		MovieVO movie = mList.get(selectedIndex);
		ImageIcon image = new ImageIcon("posters/" +movie.getPosterName()+ ".jpg");
		String infoStr = "<html>"
				+"* ��ȭ���� : <font size='5' color='navy' face='���� ���'>"+ movie.getMovieTitle()+"</font><br>"
				+"* �帣 : "+movie.getGenre()+"<br>"
				+"* ���ѿ��� : "+movie.getOverAge()+"<br>"
				+"* ���� : "+movie.getPrice()+"<br>"
				+"</html>";
		JLabel lblPoster = new JLabel(image);
		JLabel lblInfo = new JLabel(infoStr);
		JPanel pan = new JPanel();
		btnSelect.addActionListener(new BtnSelectHandler(mainView, movie, this));
		btnCancle.addActionListener(new BtnSelectHandler(mainView, movie, this));
		add(lblPoster);
		add(lblInfo);
		pan.add(btnSelect);
		pan.add(btnCancle);
		add(pan);
	}
}
