package exam_Q5;

public class CoffeeShop {

	private String shopName;
	private int customerCount;
	private int money;
	private Menu[] menus;
	
	//생성자
	public CoffeeShop(String shopName,Menu[] menus){
		this.shopName = shopName;
		this.menus = menus;
	}
	
	public int take(String menuName) {
		customerCount++;
		int price =0;
		for(int i =0;i<menus.length;i++) {
			if(menus[i].getMenuName()==menuName) {
				price = menus[i].getPrice();
				make(i);
			}
		}
		this.money += price;
		return price;
	}
	private void make(int menuIndex) {
		System.out.println(menus[menuIndex].getMenuName()+"를 만들자");
	}
	

	public void showInfo() {
		System.out.printf("%s의 손님은 %d명이고, 수입은 %d원입니다.\n",shopName,customerCount,money);
	}
}
