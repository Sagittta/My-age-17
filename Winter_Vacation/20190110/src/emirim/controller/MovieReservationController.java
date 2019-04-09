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
		String[] movieTitles = {"�Ű� �Բ�", "������ �׳�", "�����"};
		int[] overAges = {12, 15, 12};
		String[] genres = {"���","�ڹ̵�","��Ÿ��"};
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
			System.out.print("�� ������ ��ȭ�� �����Ͻðڽ��ϱ�?");
			String answer = s2.nextLine();
			if(answer.equals("y") || answer.equals("Y"))
				//MovieVO movie = dao.selectedMovie(user);
				view.displayTicket(dao.selectedMovie(user));
				//view.payCard(movie);
				System.out.println("Ƽ���� ����Ͽ����ϴ�.");
				break;
			}
			s1.close();
			s2.close();
		}
	}
