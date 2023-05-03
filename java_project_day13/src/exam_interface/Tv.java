package exam_interface;

public class Tv implements RemoteControl {
	private int volume;
	private int channel;

	@Override
	public void turnOn() {
		System.out.println("TV turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("TV turn Off");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;	
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}
	
	@Override
	public int getVolume() {
		return volume;
	}
	
	public void printChannel() {
		System.out.println("현재 채널은 "+channel);
	}
	
	public void channelUp() {
		channel++;
	};
	
	public void channelDown() {
		channel--;
	};
	
}
