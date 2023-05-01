package exam_singleton;

public class Singleton {

	//private 접근 권한을 갖는 정적 필드선언과 초기화
	private static Singleton singleton = null;
	
	//private 접근권한을 갖는 생성자 선언
	private Singleton() {}
	
	//public접근 권한을 갖는 정적 메소드 선언
	public static Singleton getInstance() {
		if(singleton == null) {singleton = new Singleton();}
		return singleton;
	}
}
