package exam_class_array;

import java.util.Scanner;

//객체 배열을 선언하여 값을 입력받아 대입 후 추렭하는 코드를 작성해 주세요
class Book{
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author  = author;
	}
	
	public String toString() {
		return "["+title+","+author+"]";
	}
}


public class BookArray {
	public static void main(String[] args) {
		Book[] books = new Book[2];
		
		Scanner input = new Scanner(System.in);
		for(int i=0; i<books.length;i++) {
			System.out.print("제목>>");
			String title = input.nextLine();
			
			System.out.print("저자>>");
			String author = input.nextLine();
			
			books[i] = new Book(title,author);
		}
		input.close();
		
		for(Book book:books) {
			System.out.println(book.toString());
		}

	}

}
