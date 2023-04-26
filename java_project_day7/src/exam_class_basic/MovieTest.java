package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
	
public static Scanner input = new Scanner(System.in);
static public int count = 0;
public static void main(String[] args) {
		Movie mv1 = new Movie();
		Movie mv2 = new Movie();
		
		inputData(mv1);
		mv1.printMovieInfo();
		
		inputData(mv2);
		mv2.printMovieInfo();

		input.close();
}
	
public static void inputData(Movie mv) {
	
	System.out.println("영화 제목을 입력해주세요");
	mv.setTitle(input.next());
	
	System.out.println("영화 감독을 입력해주세요");
	mv.setDirector(input.next());
	mv.setMovieNum(count++);
}

}


