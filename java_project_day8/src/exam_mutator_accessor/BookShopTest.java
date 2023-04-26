package exam_mutator_accessor;

/* 책을 관리하는 BookShop 클래스를 만든다. 
 * 클래스는  책제목(title), 저자(author), 책 가격(price)을 필드로 가진다. 
 * 각 각 필드는 설정자와 접근자를 생성한다. 
 * 그리고 필드에 값을 대입하기 위한 메서드도 생성하고 책정보를 출력하도록 코딩하시오.
 */ 

public class BookShopTest {
	public static void main(String[] args) {

		BookShop book1 = new BookShop("부의 추춸차선","아무개",1000);
		System.out.println(book1.toString());
		
		BookShop book2 = new BookShop();
		System.out.println(book2.toString());
		
		BookShop book3= new BookShop("어린왕자",5000);
		System.out.println(book3.toString());
	}

}
