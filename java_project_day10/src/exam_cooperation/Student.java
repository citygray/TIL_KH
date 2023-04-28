package exam_cooperation;

public class Student {
	//학생이름
	public String StudentName;
	//학년
	public int grade;
	//학생이 가지고 있는 돈
	public int money;
	
	//학생이름과 가진 돈을 매개변수로 받는 생성자
	Student(String StudentName, int money){
		this.StudentName = StudentName;
		this.money = money;
	}
	
	//학생이 버스를 타면 1000원을 지불하는 기능 메서드
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	//학생이 지하철을 타면 1500원을 지불하는 기능 메서드
	public void takeSubway(Subway subway){
		subway.take(1500);
		money -= 1500;
	}
	
	//학생의 현재정보를 출력하는 메서드
	//예) james님의 남은 돈은 4000원입니다.
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n",StudentName,money);
	}

}
