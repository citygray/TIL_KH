package exam_collections;

public class Fruit implements Comparable<Fruit>{
	
	/* 클래스 : Fruit
     * 필드 :과일명(name), 가격(price)*/
	private String name;
	private int price;
	
	public Fruit(String name,int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit) {
			Fruit fruit = (Fruit) obj;
			if(this.price==fruit.price) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return price;
	}
	
	@Override
	public int compareTo(Fruit o) {
		
		int r = this.getPrice() - o.getPrice();
		if(r>0)
			return 1;
		else if(r==0)
			return 0;
		else 
			return -1;
		
	}

}
