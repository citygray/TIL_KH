package exam_Q5;


public class Person {
	//이름
	private String name;
	//가진돈
	private int money;
	
	
	//생성자
	public Person(String name,int money){
		this.name = name;
		this.money = money;
	}
	
	
	public void takeCoffee(CoffeeShop cs,String menuName ){
		int coffeePrice = cs.take(menuName);
		money -= coffeePrice; 
		
	}
	
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d원 입니다.\n",name,money);
		
	}
	

}
