package exam_interface;

public interface RemoteControl {
	
	//상수
	public static final int MAX_VOLUME = 32;
	int MIN_VOLUME = 0;
	
	//추상메서드
	public abstract void turnOn();
	public abstract void turnOff();
	
	void setVolume(int volume);
	int getVolume();

}
