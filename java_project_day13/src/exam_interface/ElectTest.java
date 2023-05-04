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
		
		System.out.println("-------------------------");
		
		things[1].turnOn();
		things[1].setVolume(-100);
		System.out.println("티비 볼륨: "+things[1].getVolume());
		
		//다운 캐스팅
		Tv tv1 = (Tv)things[1];
		tv1.printChannel();
		tv1.channelUp();
		tv1.printChannel();
		
		System.out.println("-------------------------");
		
		//SmartTv
		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("http://www.naver.com");
		smart.turnOff();
		smart.setMute(true);
		
		System.out.println("-------------------------");
		
		//다형성에 의해
		//인터페이스 참조변수 = new 구현클래스 생성자();
		//인터페이스 참조변수 = new 인터페이스 생성자(); 문법적으로 성립하는 문장이 아님
		//RemoteControl rcl = new RemoteControl();
		
		RemoteControl rc = new Tv();
		rc.turnOn();	//인터페이스에 선언된 메서드 접근
		//rc.printChannel(); //구현클래스의 메서드 접근은 불가능
		((Tv) rc).printChannel();
		rc.turnOff();
		
		rc = new Radio("표준FM",95.9);
		rc.turnOn();
		//구현클래스의 메서드 호출 방법 - 1
		((Radio)rc).printRF();
		
		//구현클래스의 메서드 호출 방법 - 2
		Radio ro = (Radio)rc;
		ro.printRF();
		
		rc.turnOff();
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(16);
		Searchable rs = (Searchable)rc; 
		rs.search("http://www.daum.net");
		
		//rc = new Car();
		//RemoteControl 인터페이스로 구현된 클래스가 아니기 때문에 위와 같이 불가능.
		
		
		
		
	}
}
