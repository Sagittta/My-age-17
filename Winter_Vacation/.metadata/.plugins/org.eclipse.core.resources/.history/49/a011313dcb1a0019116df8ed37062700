package emirim.controller;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;
import emirim.persistence.VendingMachineDAO;
import emirim.view.VendingMachineView;

public class VendingMachineController {

	public static void main(String[] args) {
		String[] productNames = {"마우틴듀", "미란다", "포카리스웨트", "웰치스", "사이다"};
		int[] productPrices = {1500, 1200, 900, 1300, 700};
		VendingMachineDAO dao = new VendingMachineDAO();
		
		for (int i = 0; i < productPrices.length; i++) {
			dao.addProduct(new ProductVO(i, productNames[i], productPrices[i], 10));
		}
		UserDTO user = new UserDTO();
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		VendingMachineView view = new VendingMachineView();
		view.displayProducts(dao.getProductList());
		
		while(true) {
			view.inputUserInfo(user, s1);
			view.displayResult(dao.selectedProduct(user), user);
			System.out.print("* 계속 제품을 구매하시겠습니까?(y//n) *");
			String answer = s2.nextLine();
			if (answer.equals("n") || answer.contentEquals("N"))
				break;
		}
		
		s1.close();
		s2.close();
	}

}
