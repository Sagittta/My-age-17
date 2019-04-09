package domain;

public class UserDTO {
	private int productId; //사용자가 선택한 제품번호
	private int insertMoney; //투입한 돈
	private int change; //잔돈
	
	public UserDTO() {}
	
	public UserDTO(int productId, int insertMoney, int change) {
		super();
		this.productId = productId;
		this.insertMoney = insertMoney;
		this.change = change;
	}

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
	
}