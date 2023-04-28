package exam_cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// 학생 두명 생성
		Student[] students = {
				new Student("김난이", 10000),
				new Student("하승수", 6000),
				new Student("하윤아", 1500)
		};
		//버스생성
		Bus bus100 = new Bus(100);
		Subway subway2 = new Subway("2");
		
		//학생1 버스 탐
		students[0].takeBus(bus100);
		students[1].takeBus(bus100);
		
		students[2].takeSubway(subway2);
		
		//학생1 정보 출력
		students[0].showInfo();
		students[1].showInfo();
		students[2].showInfo();
		
		//버스 정보 출력
		bus100.showInfo();
		subway2.showInfo();
	}

}
