package exam_Q5;


public class BuyCoffe {
	public static void main(String[] args) {
		//김씨는 4000원을 내고 별다방에서 아메리카노를 사마셨습니다.
		
		
		// 사람 두명 생성
		Person[] persons = {
				new Person("김씨",300000),
				new Person("이씨",10000)
		};
				
		Menu[] sbusMenus = {
				new Menu("아메리카노",3000),
				new Menu("바닐라라떼",4000)
		};
		
		// 커피숍 생성
		CoffeeShop starbus = new CoffeeShop("스타벅스", sbusMenus);
				
		//김씨,이씨 커피 삼
		persons[0].takeCoffee(starbus, "아메리카노");
		persons[1].takeCoffee(starbus, "바닐라라떼");
		
				
		//김씨,이씨  출력
		persons[0].showInfo();
		persons[1].showInfo();
				
		//커피숍 정보 출력
		starbus.showInfo();
				
	}

}
