package exam_array;

public class Example2 {

	public static void main(String[] args) {
		int[] scores = {1,2,1,2,3,1,2,2,3,1,3,3,1,1,1,2,3,1,3,2};

		//int[] results = {0,0,0};
		// 기본형 배열요소는 기본값으로 초기화 됨
		int[] results = new int[3];
		
		for(int score:scores) {
			switch(score) {
			case 1:
				results[0]++;
				break;
			case 2:
				results[1]++;
				break;
			case 3:
				results[2]++;
				break;
			}
		}
		
		System.out.println("총 응답수: "+scores.length);
		
		System.out.println("불만족: "+results[0]);
		System.out.println("보통: "+results[1]);
		System.out.println("만족: "+results[2]);

	}

}
