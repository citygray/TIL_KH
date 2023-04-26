package exam_class_basic;

public class Car {
	//필드정의
	private int speed;
	private int gear;
	public String color;

	//default 생성자
	public Car() {
		this(0,0,"black");
	}
	
	// 전체 필드의 값 대입 - test
	public Car(int s,int g,String c){
		this.speed = s;
		this.gear = g;
		this.color =c;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>0) {
			this.speed = speed;
		}else {
			this.speed = 0;
		}
	}
	
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		if(gear>0) {
			this.gear = gear;
		}else {
			this.gear = 0;
		}
		
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
