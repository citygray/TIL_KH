package exam_class_basic;

import java.util.Date;

/*
 * 상영관이 하나, 좌석이 10개만 있는 영화관이 있다.
 * */

public class Movie {
	//필드정의
	private int movieNum;
	private String title;
	private String director;
	static public int movieCount = 0;
	
	//생성자
	public Movie(String title, String director) {
		super();
		movieCount++;
		this.movieNum = movieCount;
		this.title = title;
		this.director = director;
	}
	
	//영화정보 출력
	public void printMovieInfo(){
		System.out.printf("구분번호: %d번, 제목: %s, 감독: %s\n",movieNum,title,director);
	}
}

class Theater{
	public int num;
	public Time[] timetable;
	public int totalSeat;
	
	//타임테이블을 작성한다.
	
	//타임테이블을 본다.
	
	//회차와 영화를 선택한다.
	private void selectTime() {}

	//좌석을 선택한다.
	private void selectSeat() {}
	
	//예매정보를 출력한다.
	public void printInfor() {}
}

class Time{
	private Date sDate;
	private Date eDate;
	private Movie movie; 
	private boolean[] seats;
	public Time(Date sDate, Date eDate, Movie movie, boolean[] seats) {
		super();
		this.sDate = sDate;
		this.eDate = eDate;
		this.movie = movie;
		this.seats = seats;
	}
	
}

