package emirim.domain;

public class UserDTO {
	private int productID;		//사용자가 선택한 제품번호
	private int insertMoney;	//사용자가 투입한 돈
	private int change;			//반환받을 잔돈
	
	public UserDTO() {
		
	}
	
	public UserDTO(int productID, int insertMoney, int change) {
		super();
		this.productID = productID;
		this.insertMoney = insertMoney;
		this.change = change;
	}

	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	
	public int getInsertMoney() {
		return insertMoney;
	}
	public void setInsertMoney(int insertMoney) {
		this.insertMoney = insertMoney;
	}
	
	public int getChange() {
		return change;
	}
	public void setChange(int change) {
		this.change = change;
	}

	@Override
	public String toString() {
		return "UserDTO [productID=" + productID + ", insertMoney=" + insertMoney + ", change=" + change + "]";
	}
	
}
