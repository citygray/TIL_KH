package exam_collection_list;

import java.util.ArrayList;


//Apple 이라는 이름으로 클래스를 생성한다. 이 클래스는 품종(kind)과 색상(color)을 필드로 가진다.
// 여러 사과(Apple)를 저장하도록 인스턴스 생성하여 출력해 주세요.

class Apple {

	private String kind;
	private String color;
	
	public Apple(String kind,String color){
		this.color= color;
		this.kind = kind;
	}
	
	public String toString() {
		return kind +" : "+color;
	}
	
}

public class AppleTest{
	public static void main(String[] args) {
		ArrayList<Apple> appleLs = new ArrayList<Apple>();
		appleLs.add(new Apple("아오리","초록"));
		appleLs.add(new Apple("홍로","빨강"));
		appleLs.add(new Apple("후지","초록"));
		
		for(Apple apple:appleLs) {
			System.out.println(apple);
		}
	}
}


