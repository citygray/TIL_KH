package exam_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MovieTest {
	
// 여러 영화(Movie) 정보를  저장하도록 인스턴스 생성
	
public static Scanner input = new Scanner(System.in);
static public int count = 0;
public static void main(String[] args) {
	
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie());
		movies.add(new Movie());

		
		inputData(movies.get(0));
		inputData(movies.get(1));
		
//		movies.get(0).printMovieInfo();
//		movies.get(1).printMovieInfo();
		
		input.close();
		
		//반복자
		Iterator<Movie> it = movies.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
}
	
public static void inputData(Movie mv) {
	
	System.out.println("영화 제목을 입력해주세요");
	mv.setTitle(input.next());
	
	System.out.println("영화 감독을 입력해주세요");
	mv.setDirector(input.next());
	mv.setMovieNum(count++);
}

}


