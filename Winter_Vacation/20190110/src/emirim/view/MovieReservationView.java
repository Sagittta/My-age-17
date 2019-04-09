package emirim.view;
import java.util.ArrayList;
import java.util.Scanner;
import emirim.domain.MovieVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;

public class MovieReservationView {
	
	public void displayMovies(MovieDAO dao) {
		ArrayList<MovieVO> movieList = dao.getMovieList();
		System.out.println("★★★★★★★★★  KVC ★★★★★★★★★★★");
		for (MovieVO movieVO : movieList) {
			System.out.printf("★ MovieId : %d\n",movieVO.getMovieId());
			System.out.printf("★ Title : %s\n",movieVO.getMovieTitle());
			System.out.printf("★ Genre : %s\n",movieVO.getGenre());
			System.out.printf("★ Price : ￦%d\n",movieVO.getPrice());
			System.out.printf("★ OverAge : %d\n",movieVO.getOverAge());
			System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★");
		}
		
	}
	
	public void userInputInfo( UserDTO user, Scanner s) {
		System.out.println("★★★★★사용자 영화 선택★★★★★");
		System.out.print("★ 영화 선택(MovieID 입력) : ");
		int selectedMovieId = s.nextInt();
		user.setSelectedMovieId(selectedMovieId);
	}
	
	public void payCard(MovieVO movie) {
		System.out.printf("★ %s영화의 예매가 진행됩니다. %d원이 카드로 결제되었습니다.\n", movie.getMovieTitle(),movie.getPrice());
	}
	
	public void displayTicket(MovieVO movie) {
		System.out.println("★★★★★★★★★★★★★★★★");
		System.out.println("★★Movie Ticket★★★★");
		System.out.printf("★ Title : %s\n ",movie.getMovieTitle());
		System.out.printf("★ Price : %s원\n ",movie.getPrice());
		System.out.printf("★ OverAge : %s세\n ",movie.getOverAge());
		System.out.printf("★ Genre : %s\n ",movie.getGenre());
		System.out.printf("★ %d관  11:50 AM \n ",7);
		System.out.println("★★★★★★★★★★★★★★★★");
		
	}
}
