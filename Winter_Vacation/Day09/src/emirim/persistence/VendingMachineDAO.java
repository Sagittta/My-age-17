package emirim.persistence;

import java.util.ArrayList;

import emirim.domain.ProductVO;
import emirim.domain.UserDTO;

public class VendingMachineDAO {
	private ArrayList<ProductVO> productList = new ArrayList<ProductVO>();

	public ArrayList<ProductVO> getProductList() {
		return productList;
	}
	
	public void addProduct(ProductVO product) {
		productList.add(product);
	}
	
	public ProductVO selectedProduct(UserDTO user) {
		return productList.get(user.getProductID());
	}
}
