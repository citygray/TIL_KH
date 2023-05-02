package exam_class;

public class Book {
	//도서는 책제목, 책 총페이지수, 저자정보, 출판사 정보를 필드로 가진다
	private String title;
	private int pageNum;
	private Author author;
	private Publisher publisher;
	
	Book(){};
	
	Book(String title,int pageNum,Author author,Publisher publisher){
		this.title = title;
		this.pageNum  = pageNum;
		this.author = author;
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	};
	
	public String toString() {
		
		String srt = "";
		
		srt += String.format("책제목 : %s\n",title);
		srt += String.format("페이지수 : %d\n",pageNum);
		srt += String.format("저자명 : %s\n",author.getName());
		srt += String.format("저자나이 : %d\n",author.getAge());
		srt += String.format("저자국적 : %s\n",author.getNation());
		srt += String.format("출판사명 : %s\n",publisher.getPublisherName());
		srt += String.format("출판사국가명 : %s\n",publisher.getNation());
		
		return srt;

	}

	
}
