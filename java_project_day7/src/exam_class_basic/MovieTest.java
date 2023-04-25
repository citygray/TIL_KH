package exam_class_basic;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
//		Movie movie1 = new Movie("살인의 추억","봉준호");
//		Movie movie2 = new Movie("기생충","봉준호");
//		movie1.printMovieInfo();
//		movie2.printMovieInfo();
		
		Movie[] movies = new Movie[10];
		
		//사용자에게 영화정보를 입력받아서 영화객체 생성
		Scanner input = new Scanner(System.in);
		String userInput;
		while(true) {
			System.out.println("영화 정보를 입력해주세여(입력예:슈렉,아무개/ 종료:q /전체보기:l)");
			userInput = input.next();
			if(userInput.equals("q")) {
				System.out.println("입력이 종료됩니다.");
				break;
			}
			if(userInput.equals("l")) {
				System.out.println("전체보기");
				for(int i =0; i<Movie.movieCount;i++) {
					movies[i].printMovieInfo();
				}
				break;
			}
			String[] movieInfo =  userInput.split(",");
			movies[Movie.movieCount] = new Movie(movieInfo[0],movieInfo[1]);
			movies[Movie.movieCount-1].printMovieInfo();
		}
		
		input.close();
	}

}
