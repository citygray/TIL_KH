package exam;

public class ScoreOXMain {
/*
 * 다음과 같이 주어진 데이터를 이용해서 ScoreOX 클래스를 통해서 실행결과와 같이 나올 수 있도록 구현하시오.
 * 번호(no), 이름(name), 1~5번의 입력 답(dap[]), 답의 개수를 체크하는 cnt를 이용하여 
 * 점수(score)를 매기고 맞는 전체 개수를 체크하는 static 변수인 tot를 이용한다.
 * 또한 생성자를 이용하여 번호, 이름, 답을 받아 객체를 생성하고 
 * compute() 메서드에서는 정답{1,1,1,1,1}과 입력한 데이터가 맞으면 개수와 전체 개수를 체크하여 display() 메서드로 각 내용을 출력한다. 
 * 마지막으로 static 메서드인 ranking() 메서드에서는 5명의 ScoreOX의 객체를 배열로 받아 순위를 구한다.
 */
	
	public static void main(String[] args) {
		ScoreOX[] sc = {
				new ScoreOX(1,"홍길동",new int[]{1,2,1,3,4}),
				new ScoreOX(2,"김철수",new int[]{1,1,1,1,1}),
				new ScoreOX(3,"이진희",new int[]{1,2,1,3,1}),
				new ScoreOX(4,"조현민",new int[]{1,1,1,3,1}),
				new ScoreOX(5,"최현정",new int[]{1,4,2,5,4})
		};
		
		System.out.println("--------------------------------------------");
		System.out.println("번호  이름   1  2  3  4  5  점수  등수");
		System.out.println("--------------------------------------------");
		
		ScoreOX.ranking(sc);
		
		for(ScoreOX scoreInfo:sc) {
			scoreInfo.display();
		}
		
		System.out.println("\n전체 맞은 개수 = " + ScoreOX.tot);

	}

}
