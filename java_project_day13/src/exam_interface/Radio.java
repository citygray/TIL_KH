package exam_interface;

public class Radio implements RemoteControl {

	private int volume;
	
	
	@Override
	public void turnOn() {
		System.out.println("Radio turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Radio turn Off");

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

}
