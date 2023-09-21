package week04.practice2.source02;

public class TV {
	private boolean power;
	private int channel = 5;
	private int volume = 10;
	
	public void showTV() {
		if (power) {
			System.out.println("전원 : " + power);
			System.out.println("채널 : " + channel);
			System.out.println("볼륨 : " + volume);
			System.out.println();
		}
		else {
			System.out.println("전원이 꺼져있습니다.");
		}
		
	}
	
	public void powerOnOff() {
		power = !power;
	}

	public void channelUP() {
		if(power)
			++channel;
		showTV();
	}

	public void channDown() {
		if (power)
			++channel;
		showTV();
	}
	
	public void volumeUp() {
		if (power && volume < 20)
			++volume;
		showTV();			
	}
	
	public void volumeDown() {
		if (power && volume > 0)
			--volume;
		showTV();			
	}
}
