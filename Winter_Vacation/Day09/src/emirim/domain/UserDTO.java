package emirim.domain;

public class UserDTO {
	private int productID;		//����ڰ� ������ ��ǰ��ȣ
	private int insertMoney;	//����ڰ� ������ ��
	private int change;			//��ȯ���� �ܵ�
	
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
