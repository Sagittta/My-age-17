package emirim.television;

public class Television {
	private String owner;
	private String brand;
	private String channel;
	private int volume;
	private int size;
	private boolean power;
	private String powerValue;
	
	public Television() {}
	
	public Television(String owner, String brand, String channel, int volume, int size, boolean power, String powerValue) {
		this.owner = owner;
		this.brand = brand;
		this.channel = channel;
		this.volume = volume;
		this.size = size;
		this.power = power;
		this.powerValue = powerValue;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public String getPowerValue() {
		return powerValue;
	}
	public void setPowerValue(String powerValue) {
		this.powerValue = powerValue;
	}

	public void changeChannel() {
		System.out.println(owner + "�� " + channel + "ä�η� �ٲ۴�.");
	}
	
	public void upVolume() {
		System.out.println(owner + "�� " + (volume + 1) + "�� ������ ���δ�.");
	}
	
	public void downVolume() {
		System.out.println(owner + "�� " + (volume - 1) + "�� ������ ���δ�.");
	}
	
	public void onPower() {
		power = true;
		powerValue = "on";
		System.out.println(owner + "�� TV ������ �Ҵ�.");
	}
	
	public void offPower() {
		power = false;
		powerValue = "off";
		System.out.println(owner + "�� TV ������ ����.");
	}
	
	public void tvInfo() {
		System.out.println("TV �귣��� " + brand + "�̰�, ũ��� " + size + "inch �̴�.");
	}
	
	public void showInfo() {
		System.out.println("**********************************");
		System.out.println("** ����: " + owner);
		System.out.println("** �귣��: " + brand);
		System.out.println("** ä��: " + channel);
		System.out.println("** ����: " + volume);
		System.out.println("** ũ��: " + size + "inch");
		System.out.println("** on/off: " + powerValue);
		System.out.println("**********************************");
	}

	@Override
	public String toString() {
		return "Television [owner=" + owner + ", brand=" + brand + ", channel=" + channel + ", volume=" + volume
				+ ", size=" + size + ", power=" + power + ", powerValue=" + powerValue + "]";
	}
	
	
}
