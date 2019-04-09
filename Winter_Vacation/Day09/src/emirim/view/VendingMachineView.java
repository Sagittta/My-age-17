package emirim.view;

import java.util.ArrayList;
import java.util.Scanner;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VendingMachineView {
//	전체 제품을 화면에 출력
	public void displayProducts(ArrayList<ProductVO> productList) {
		System.out.println("=========================");
		for (ProductVO productVO : productList) {
			System.out.printf("제품번호: %d :: [[ %s ]] (가격: %d)\n", productVO.getProductID(), productVO.getProductName(), productVO.getPrice());
			System.out.println();
		}
		System.out.println("=========================");
		System.out.println();
	}
//	사용자가 입력할 수 있는 화면
	public void inputUserInfo(UserDTO user, Scanner s1) {
		System.out.print("* 제품번호 선택 : ");
		user.setProductID(s1.nextInt());
		System.out.println("* 돈 투입 : ");
		user.setInsertMoney(s1.nextInt());
	}
//	선택한 제품에 대한 결과를 출력
	public void displayResult(ProductVO product, UserDTO user) {
		int stockNum = product.getStockNum();
		System.out.println("=========================");
		System.out.println();
		if (stockNum > 0) {			//재고 있음
			if (user.getInsertMoney() >= product.getPrice()) {		//돈 같거나 많음
				product.setStockNum(stockNum--);
				System.out.printf("☞『%s』 제품이 나왔습니다.\n", product.getProductName());
				user.setChange(user.getInsertMoney() - product.getPrice());
				System.out.printf("☞ 반환금액 %d원이 나왔습니다. \n", user.getChange());
			} else {		//투입금액 부족
				System.out.println("!! 투입금액이 부족합니다.");
				System.out.printf("!! 투입금액 %d원이 반환되었습니다.", user.getInsertMoney());
			}
		} else {			//재고 부족
			System.out.println("!! 재고가 부족합니다.");
			System.out.printf("!! 투입금액 %d원이 반환되었습니다.", user.getInsertMoney());
		}
		System.out.println();
		System.out.println("=========================");
	}
}
