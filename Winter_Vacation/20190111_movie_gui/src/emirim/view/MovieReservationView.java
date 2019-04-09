package emirim.view;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import emirim.domain.MovieVO;
import emirim.handler.BtnPayHandler;
import emirim.handler.LblHandler;
import emirim.persistence.MovieDAO;

public class MovieReservationView extends JFrame {
	
	public JLabel lblInfo = new JLabel("선택된 내용 없음");
	public JLabel lblTicket = new JLabel("", JLabel.CENTER);
	
	public MovieReservationView(MovieDAO dao) {
		displayMovies(dao);
		displayInfo();
		displayTicket();
		getContentPane().setBackground(Color.WHITE);
		setTitle("영화 예매 정보 시스템");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(150, 170, 680, 800);
		setVisible(true);
	}
	
	public void displayMovies(MovieDAO dao) {
		int[] movieIds = {11,9,17};
		String[] movieTitles = {"신과 함께", "내안의 그놈", "어벤져스"};
		int[] overAges = {12, 15, 12};
		String[] genres = {"드라마","코미디","판타지"};
		int[] prices = {6000,8000,9000};
		String[] posterNames = {"poster0","poster1","poster2"};
		for (int i = 0; i < prices.length; i++) {
			dao.addMovie(new MovieVO(movieIds[i], movieTitles[i], overAges[i], genres[i], prices[i], posterNames[i]));
		}
		JPanel panN = new JPanel();
		panN.setBackground(Color.GRAY); //배경 색
		ArrayList<MovieVO> mList = dao.getMovieList(); 
		//포스터 배치하는 작은 상자 만들 때 사용하는 반복문(영화 개수만큼 상자 만듬)
		JPanel[] panPosters = new JPanel[3];
		JLabel[] lblIcons = new JLabel[3];
		for (int i = 0; i < panPosters.length; i++) {
			panPosters[i] = new JPanel();
			MovieVO movie = mList.get(i);
			ImageIcon icon = new ImageIcon("posters/" + movie.getPosterName()+".jpg");
			lblIcons[i] = new JLabel(icon);
			lblIcons[i].addMouseListener(new LblHandler(this, dao, lblIcons));
			panPosters[i].add(lblIcons[i]);
			panN.add(panPosters[i]);
			panPosters[i].setBackground(Color.GRAY);
			
		}
		add(panN,"North");
	}

	public void displayInfo() {
		JPanel pan = new JPanel(new FlowLayout(FlowLayout.CENTER, 100, 120));
		pan.setBackground(Color.PINK);
		JButton btnPay = new JButton("결제");
		btnPay.addActionListener(new BtnPayHandler(this));
		pan.add(lblInfo);
		pan.add(btnPay);	
		lblInfo.setOpaque(true);
		lblInfo.setBackground(Color.PINK);
		add(pan, "Center");
	}
	
	public void displayTicket() {
		lblTicket.setOpaque(true);
		lblTicket.setBackground(Color.GRAY); 
		lblTicket.setForeground(Color.PINK);
		Font font = new Font("맑은 고딕 ", Font.BOLD, 10);
		add(lblTicket, "South");
	}
	
	public static void main(String[] args) {
		MovieDAO dao = new MovieDAO();
		MovieReservationView view = new MovieReservationView(dao);
		
		
		//view.displayMovies(dao);

	}

}
