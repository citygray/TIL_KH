package exam_class_basic;

public class Score {
	/*
	 * 성적을 출력하는 Score클래스를 정의하자
	 * 이름/국어/영어/수학/총점을 저장하고자 한다.(필드구현)
	 * 필드에 값을 설정할 수 있는 기능, 점수들의 합을 구하는 기능, 평균을 구하는 기능, 학점을 구하는 기능,
	 * 모든 필드를 출력할 수 있는 기능을 포함하도록 한다.(메서드 구현)
	 */
	public String name;
	public int kor,eng,math,total;
	
	//필드에 값을 설정할 수 있는 기능
	public void data(String name,int kor,int eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	//합을 구하는 메서드
	public void getSum() {
		total = kor+eng+math;
	}
	
	//평균을 구하는 메서드
	public double getAvg() {
		return (double)total/3;
	}
	
	//학점을 구하는 메서드
	public char getGrade() {
		double avg = getAvg();
		char grade = '\0';//null 의미
		if(90<=avg) {
			grade = 'A';
		}else if(80<=avg){
			grade = 'B';
		}else if(70<=avg){
			grade = 'C';
		}else if(60<=avg){
			grade = 'D';
		}else {
			grade = 'F';
		}
		return grade;
	}
	
	//모든 필드를 출력할 수 있는 기능
	public String toString() {
		return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c",name,kor,eng,math,total,getAvg(),getGrade());
	}
	

}
