package emirim.controller;

import java.util.ArrayList;

import emirim.television.Television;

public class TelevisionController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] owners = {"전은정", "장원이", "엄하늘", "강혜정", "김소현"};
		String[] brands = {"LG", "SAMSUNG", "APPLE", "LG", "SAMSUNG"};
		String[] channels = {"JTBC", "TVN", "SBS", "KBS", "MBC"};
		int[] volumes = {5, 6, 7, 8, 9};
		int[] sizes = {100, 120, 140, 150, 160};
		boolean[] powers = {true, false, true, false, true};
		String[] powerValues = {"on", "off", "on", "off", "on"};
		
		ArrayList<Television> tvlist = new ArrayList<>();
		
		for (int i = 0; i < owners.length; i++) {
			Television television = new Television();
			television.setOwner(owners[i]);
			television.setBrand(brands[i]);
			television.setChannel(channels[i]);
			television.setVolume(volumes[i]);
			television.setSize(sizes[i]);
			television.setPower(powers[i]);
			television.setPowerValue(powerValues[i]);
			tvlist.add(television);
		}
		
		for (Television television : tvlist) {
			television.showInfo();
			television.onPower();
			television.offPower();
			television.changeChannel();
			television.downVolume();
			television.upVolume();
			television.tvInfo();
		}
	}

}
