package exam_class;

public class BookMain {

	public static void main(String[] args) {
		/*
		 * 도서는 책제목, 책 총페이지수, 저자정보, 출판사 정보를 필드로 가진다
		 * 저자의 이름과나이, 국가명을 필드로 가진다.
		 * 출판사는 출판사와 국가명을 필드로 가진다.
		 * 각각은 생성자, 접근자, 설정자를 가진다.
		 * 책제목, 페이지수, 저자명, 저자나이, 저자국적, 출판사명, 출판사국가명을 출력해 주세요
		 */
		
		Author author1 = new Author("김난이",38,"미국");
		Publisher publisher1 = new Publisher("청울림출판","한국");
		
		Book book1 = new Book("java의 뿌셔",300,author1,publisher1);
		
		System.out.println(book1.toString());
	}

}
