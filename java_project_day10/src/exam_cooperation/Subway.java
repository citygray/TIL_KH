package exam_cooperation;

public class Subway {
	String lineNum;
	int passCount;
	int money;
	
	Subway(String lineNum){
		this.lineNum = lineNum;
	}
	
	public void take(int money) {
		this.money += money;
		passCount++;
	}
	
	public void showInfo() {
		System.out.printf("%s호선 승객은 %d이고, 수입은 %d원입니다.",lineNum,passCount,money);
	}
	

}
