package exam_singleton;

public class Company {

	//1. private 생성자 만들기
	private Company() {};
	
	//2. 클래스 내부에 static으로 유일한 인스턴스 생성하기
	private static Company instance = null;
	
	//3. 외부에서 참조할 수 있는 public 메서드 만들기
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
