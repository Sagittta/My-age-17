package persistence;
import java.util.ArrayList;
import domain.ProductVO;
import domain.UserDTO;

public abstract class VendingDAO {
	
	public VendingDAO() {}

	private ArrayList<ProductVO> productList = new ArrayList<ProductVO>();
	
	public void addProduct(ProductVO product) {
		productList.add(product);
	}
	
	public ProductVO selectProduct(UserDTO user) {
		
		return productList.get(user.getProductId());
	}
	
	public ArrayList<ProductVO> getProductList() {
		return productList;
	}
}