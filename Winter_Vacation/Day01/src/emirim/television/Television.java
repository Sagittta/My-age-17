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
		System.out.println(owner + "이 " + channel + "채널로 바꾼다.");
	}
	
	public void upVolume() {
		System.out.println(owner + "이 " + (volume + 1) + "로 볼륨을 높인다.");
	}
	
	public void downVolume() {
		System.out.println(owner + "이 " + (volume - 1) + "로 볼륨을 줄인다.");
	}
	
	public void onPower() {
		power = true;
		powerValue = "on";
		System.out.println(owner + "이 TV 전원을 켠다.");
	}
	
	public void offPower() {
		power = false;
		powerValue = "off";
		System.out.println(owner + "이 TV 전원을 끈다.");
	}
	
	public void tvInfo() {
		System.out.println("TV 브랜드는 " + brand + "이고, 크기는 " + size + "inch 이다.");
	}
	
	public void showInfo() {
		System.out.println("**********************************");
		System.out.println("** 주인: " + owner);
		System.out.println("** 브랜드: " + brand);
		System.out.println("** 채널: " + channel);
		System.out.println("** 볼륨: " + volume);
		System.out.println("** 크기: " + size + "inch");
		System.out.println("** on/off: " + powerValue);
		System.out.println("**********************************");
	}

	@Override
	public String toString() {
		return "Television [owner=" + owner + ", brand=" + brand + ", channel=" + channel + ", volume=" + volume
				+ ", size=" + size + ", power=" + power + ", powerValue=" + powerValue + "]";
	}
	
	
}
