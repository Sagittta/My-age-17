package emirim.handler;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import emirim.persistence.MovieDAO;
import emirim.view.MovieInfoView;
import emirim.view.MovieReservationView;

public class LblHandler extends MouseAdapter { //필요한 것만 쓰고 싶을 때 MouseAdapter
	
	private MovieReservationView mainView;
	private MovieDAO dao;
	private JLabel[] lblIcons;
	
	public LblHandler(MovieReservationView mainView ,MovieDAO dao, JLabel[] lblIcons) {
		super();
		this.mainView = mainView;
		this.dao = dao;
		this.lblIcons = lblIcons;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		Object eo = e.getSource();
		int selectedIndex = 0;
		if(eo==lblIcons[0]) {
			selectedIndex = 0;
		}else if(eo == lblIcons[1]) {
			selectedIndex = 1;
		}else if(eo == lblIcons[2]) {	
			selectedIndex = 2;
		}else if(eo == lblIcons[3]) {
			selectedIndex = 3;
		}else {
			selectedIndex = 4;
		}
		new MovieInfoView(mainView, dao, selectedIndex);	
	}	
}
