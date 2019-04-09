package emirim.controller;
import java.util.Scanner;

import emirim.domain.MovieVO;
import emirim.domain.UserDTO;
import emirim.persistence.MovieDAO;
import emirim.view.MovieReservationView;

public class MovieReservationController {

	private static final int selectedMovieId = 0;
	private static int pay;

	public static void main(String[] args) {
		int[] movieIds = {11,9,17};
		String[] movieTitles = {"신과 함께", "내안의 그놈", "어벤져스"};
		int[] overAges = {12, 15, 12};
		String[] genres = {"드라마","코미디","판타지"};
		int[] prices = {6000,8000,9000};
		 
		MovieDAO dao = new MovieDAO();
		
		for (int i = 0; i < prices.length; i++) {
			dao.addMovie(new MovieVO(movieIds[i], movieTitles[i], overAges[i], genres[i], prices[i]));
		}
		 
		MovieReservationView view = new MovieReservationView();
		view.displayMovies(dao);
		
		UserDTO user = new UserDTO(pay, selectedMovieId);
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		while(true) {
			view.userInputInfo(user, s1);
			MovieVO movie = null;
			System.out.print("★ 선택한 영화를 결제하시겠습니까?");
			String answer = s2.nextLine();
			if(answer.equals("y") || answer.equals("Y"))
				//MovieVO movie = dao.selectedMovie(user);
				view.displayTicket(dao.selectedMovie(user));
				//view.payCard(movie);
				System.out.println("티켓을 출력하였습니다.");
				break;
			}
			s1.close();
			s2.close();
		}
	}
