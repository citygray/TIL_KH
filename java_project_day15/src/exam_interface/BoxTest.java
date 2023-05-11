package exam_interface;

public class BoxTest {

	public static void main(String[] args) {
		// Box라는 이름으로 클래스를 생성하고 실수형으로 필드(volume)를 하나 가진다.
		// 실행클래스를 생성하여 두개의 객체를 생성하여 두 객체의 필드 값을 비교하여 큰지 작은지 같은지를 판별하도록 코드를 작성하여 보자.*/

		Box b1 = new Box(100.4);
		Box b2 = new Box(85.0);
		
		//필드자체를 비교
		if(b1.getVolume() > b2.getVolume()) {
			System.out.println("b1이 b2 보다 크다");
		}else {
			System.out.println("b1가 b2와 같거나 작다");
		}
		
		//compareTo 메서드에 비교할 대상 명시하고 비교
		if(b1.compareTo(b2)>0) {
			System.out.println("b1이 b2 보다 크다");
		}else {
			System.out.println("b1가 b2와 같거나 작다");
		}
	}

}
