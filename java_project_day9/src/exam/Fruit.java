package exam;

/*
	과일 정보를 가진 Fruit 클래스를 만든다.
	필드로는 과일명(fname), 가격(price)을 가진다. 필드 초기화를 위한 생성자, 설정자와 접근자가 필요합니다.
	총 구입액에서 15% 할인된 금액으로 구입한 과일주문내역을 출력해보자. 
	실행 클래스는 별도로 생성하여 다음과 같이 결과가 나오도록 작성해 보자.

	[실행결과]
	
	============= 과일구입 목록 ==========
	banana : 4800
	strawberry : 21000
	persimmon : 19000
	cherry : 12000
	---------------------------------
	
	총금액 : 56800원
	할인후 결제 금액 : 48280원
 
 */
public class Fruit {
	
	private String fname;
	private int price;
	
	public Fruit(){}
	
	public Fruit(String fname, int price){
		//totalCount++;
		this.fname = fname;
		this.price = price;
	}
	
	public String getFname() {
		return this.fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s : %d",getFname(),getPrice());
	}

}
