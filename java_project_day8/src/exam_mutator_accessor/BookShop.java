package exam_mutator_accessor;

/* 책을 관리하는 BookShop 클래스를 만든다.
 * 클래스는  책제목(title), 저자(author), 책 가격(price)을 필드로 가진다.
 * 각 각 필드는 설정자와 접근자를 생성한다.
 * 그리고 필드에 값을 대입하기 위한 메서드도 생성한다.
 */


public class BookShop {

	private String title;
	private String author;
	private int price;
	
	public BookShop() {
		this("제목없음","작가미상",0);
	}
	
	public BookShop(String title) {
		this(title,"작가미상",0);
	}
	public BookShop(String title,int price) {
		this(title,"작가미상",price);
	}

	public BookShop(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		if(title==null||title.equals("")) {
			this.title = "제목없음";
		}else {
			this.title = title;
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return String.format("%s / %s / %d",getTitle(),getAuthor(),getPrice());
	}
	
	
}