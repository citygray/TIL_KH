package exam;


public class FruitTest {
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
	
	public static void main(String[] args) {
		Fruit[] FruitList = {
				new Fruit("banana",4800),
				new Fruit("strawberry",21000),
				new Fruit("persimmon",19000),
				new Fruit("cherry",12000)
		};
		
		
		System.out.println("---------- 과일 구입 목록---------------");
		//주문내역 보여주기
		for(int i =0;i<FruitList.length;i++) {
			System.out.println(FruitList[i].toString());
		}
		System.out.println("---------------------------------");
		System.out.println("총 갯수 : "+FruitList.length);
		System.out.println("총금액 : "+ getTotaPrice(FruitList)+"원");
		System.out.println("할인 후 결제 금액 : "+ getDiscountPrice(getTotaPrice(FruitList))+"원");
	}
	
	 
	
	//총금액 구하기
	public static int getTotaPrice(Fruit[] FruitList) {
		
		int sum=0;
		for(int i =0;i<FruitList.length;i++) {
			sum += FruitList[i].getPrice();
		}
		
		return sum;
	}
	
	//15% 할인하기
	public static int getDiscountPrice(int totalPrice) {
		
		return (int)(totalPrice * 0.85);
	}
	
	
}

