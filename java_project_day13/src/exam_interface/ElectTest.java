package exam_interface;

public class ElectTest {

	public static void main(String[] args) {
		RemoteControl[] things = {
				new Radio(),
				new Tv()
		};

		things[0].turnOn();
		things[0].setVolume(100);
		System.out.println("라디오 볼륨: "+things[0].getVolume());
		
		
		things[1].turnOn();
		things[1].setVolume(-100);
		System.out.println("티비 볼륨: "+things[1].getVolume());
		
		//다운 캐스팅
		Tv tv1 = (Tv)things[1];
		tv1.printChannel();
		tv1.channelUp();
		tv1.printChannel();
	}
}
