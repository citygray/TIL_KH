package exam_loop;

public class whileExample1 {

	public static void main(String[] args) {
		/*1에서 100까지 짝수의 합과 홀수의 합을 각각 구해보자*/
		int sumOdd = 0;
		int sumEval = 0;
		
		//for
//		for(int i =1;i<=100;i++) {
//			if(i%2==0) {
//				sumEval += i;	
//			}else {
//				sumOdd += i;
//			}
//		}
		
		//while
		int j =1;
		while(j<=100) {
			if(j%2==0) {
				sumEval += j;	
			}else {
				sumOdd += j;
			}
			j++;
		}
		
		System.out.println("홀수의 합: "+sumOdd);
		System.out.println("짝수의 합: "+sumEval);
	}

}
