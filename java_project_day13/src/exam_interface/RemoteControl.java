package exam_interface;

public interface RemoteControl {
	
	//상수
	public static final int MAX_VOLUME = 32;
	int MIN_VOLUME = 0;
	//public int volume;
	
	//추상메서드
	public abstract void turnOn();
	public abstract void turnOff();
	
	void setVolume(int volume);
	int getVolume();

	//default
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리하겠습니다.");
		}else {
			System.out.println("무음 해제하겠습니다.");
		}
	}
	
	
	//정적 메서드
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	
	/*
	public default  void setVolume(int uservolume) {
		if(uservolume>RemoteControl.MAX_VOLUME) {
			volume = RemoteControl.MAX_VOLUME;	
		}else if(uservolume<RemoteControl.MIN_VOLUME) {
			volume = RemoteControl.MIN_VOLUME;
		}else {
			volume = volume;
		}
	}
	*/
}
