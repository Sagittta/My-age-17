package emirim.view;
import java.util.ArrayList;
import java.util.Scanner;
import emirim.domain.MovieVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;

public class MovieReservationView {
	
	public void displayMovies(MovieDAO dao) {
		ArrayList<MovieVO> movieList = dao.getMovieList();
		System.out.println("�ڡڡڡڡڡڡڡڡ�  KVC �ڡڡڡڡڡڡڡڡڡڡ�");
		for (MovieVO movieVO : movieList) {
			System.out.printf("�� MovieId : %d\n",movieVO.getMovieId());
			System.out.printf("�� Title : %s\n",movieVO.getMovieTitle());
			System.out.printf("�� Genre : %s\n",movieVO.getGenre());
			System.out.printf("�� Price : ��%d\n",movieVO.getPrice());
			System.out.printf("�� OverAge : %d\n",movieVO.getOverAge());
			System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		}
		
	}
	
	public void userInputInfo( UserDTO user, Scanner s) {
		System.out.println("�ڡڡڡڡڻ���� ��ȭ ���áڡڡڡڡ�");
		System.out.print("�� ��ȭ ����(MovieID �Է�) : ");
		int selectedMovieId = s.nextInt();
		user.setSelectedMovieId(selectedMovieId);
	}
	
	public void payCard(MovieVO movie) {
		System.out.printf("�� %s��ȭ�� ���Ű� ����˴ϴ�. %d���� ī��� �����Ǿ����ϴ�.\n", movie.getMovieTitle(),movie.getPrice());
	}
	
	public void displayTicket(MovieVO movie) {
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		System.out.println("�ڡ�Movie Ticket�ڡڡڡ�");
		System.out.printf("�� Title : %s\n ",movie.getMovieTitle());
		System.out.printf("�� Price : %s��\n ",movie.getPrice());
		System.out.printf("�� OverAge : %s��\n ",movie.getOverAge());
		System.out.printf("�� Genre : %s\n ",movie.getGenre());
		System.out.printf("�� %d��  11:50 AM \n ",7);
		System.out.println("�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�");
		
	}
}
