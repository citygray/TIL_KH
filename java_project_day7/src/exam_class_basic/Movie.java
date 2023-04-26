package exam_class_basic;


/*
 * 상영관이 하나, 좌석이 10개만 있는 영화관이 있다.
 * */

public class Movie {
	//필드정의
	private int movieNum;
	private String title;
	private String director;
	
	
	//생성자
	public Movie() {}
	
	public Movie(String title, String director,int count) {
		this.movieNum = count;
		this.title = title;
		this.director = director;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setMovieNum(int count) {
		movieNum = count; 
	}
	
	//영화정보 출력
	public void printMovieInfo(){
		System.out.printf("구분번호: %d번, 제목: %s, 감독: %s\n",movieNum,title,director);
	}
	
	//toString
	public String toString() {
		return String.format("구분번호: %d번, 제목: %s, 감독: %s\n", movieNum,title,director);
	}
	

}


