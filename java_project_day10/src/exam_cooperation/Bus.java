package exam_cooperation;

public class Bus {
	//버스번호
	int busNum;
	//승객수
	int passCount;
	//버스 수입
	int money;
	
	//버스번호를 매개변수로 받는 생성자
	public Bus(int busNum){
		this.busNum = busNum;
	}
	
	//승객이 버스에 탄 경우 메서드
	public void take(int money) {
		this.money += money;
		passCount++;
	}
	
	//버스 정보를 출혁하는 메서드
	//버스 100번의 승객은 1명이고, 수입은 1000원입니다.
	public void showInfo() {
		System.out.printf("버스 %d번의 승객은 %d명이고, 수입은 %d원입니다.\n",busNum,passCount,money);
	}
	
	
}
