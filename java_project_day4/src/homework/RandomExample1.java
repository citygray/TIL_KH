package homework;

public class RandomExample1 {

	public static void main(String[] args) {
		/*
		 * [요구사항]
			50개의 난수를 만들어 for와 if문을 사용해서 다음과 같이 출력하시오.
			
			[조건]
			 - 난수의 값의 범위는 1 ~ 100사이의 값만 출력되게 한다
			 - 1줄에 6개씩 표시하도록 제어한다.
			 - 그 난수의 합도 마지막에 출력되도록 한다.
		 */
		
		int sum=0, randomNum = 0;
		
		for(int i=0;i<50;i++) {
			for(int j=0;j<6;j++) {
				randomNum = (int)(Math.random()*100)+1;
				sum += randomNum;
				System.out.printf("%d\t",randomNum);
				
			}
			System.out.println();
			
		}
		
		System.out.println("난수의 합은: "+sum);

	}

}
