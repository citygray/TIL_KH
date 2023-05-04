package exam_interface;

public class Volume {
	//상수
	public static final int MAX_VOLUME = 32;
	public static int MIN_VOLUME = 0;
	
	private int volume;
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;	
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}
	
	
	public int getVolume() {
		return this.volume;
	}
	
	
}
