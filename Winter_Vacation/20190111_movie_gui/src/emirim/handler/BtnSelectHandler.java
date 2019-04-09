package emirim.handler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import emirim.domain.MovieVO;
import emirim.view.MovieInfoView;
import emirim.view.MovieReservationView;

public class BtnSelectHandler implements ActionListener {
	
	private MovieReservationView mainView;
	private MovieVO movie;
	private MovieInfoView info;
	
	public BtnSelectHandler(MovieReservationView mainView, MovieVO movie, MovieInfoView info) {
		super();
		this.mainView = mainView;
		this.movie = movie;
		this.info = info;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object eo = e.getSource();
		if(eo == info.getBtnSelect()) {
			String text = "<html>"
					+"* ��ȭ���� : <font size='5' color='navy' face='���� ���'>"+ movie.getMovieTitle()+"</font><br>"
					+"* �帣 : "+movie.getGenre()+"<br>"
					+"* ���ѿ��� : "+movie.getOverAge()+"<br>"
					+"* ���� : "+movie.getPrice()+"<br>"
					+"</html>";
			mainView.lblInfo.setBackground(Color.PINK);
			mainView.lblInfo.setForeground(Color.BLACK);
			mainView.lblInfo.setText(text);
		}else {
			info.setVisible(false);
		}
	}

}
