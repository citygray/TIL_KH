package exam_class_basic;

public class Car {
	//필드정의
	public int speed;
	public int gear;
	public String color;
	
	// 전체 필드의 값 대입 - test
	public Car(int s,int g,String c){
		this.speed = s;
		this.gear = g;
		this.color =c;
	}
	
	
	//속도 증가 메서드, s:매개변수
	public void speedUp(int s) {
		speed += s;
	}
	//속도 감소 메서드, s:매개변수
	public void speedDown(int s) {
		speed -= s;
	}
	
	//객체의 상태를 문자열로 출력하는 메소드
	public void printData() {
		System.out.println("속도: "+speed+" 기어: "+gear+" 색상: "+color);
	}
	//객체의 상태를 문자열로 반환하는 메소드
	public String toString() {
		return "속도: "+speed+" 기어: "+gear+" 색상: "+color;
	}
	

}
