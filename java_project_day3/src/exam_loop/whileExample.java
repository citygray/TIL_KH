package exam_loop;

public class whileExample {

	public static void main(String[] args) {
		//1~5 출력하기
		int i = 1;
		while(i<=5) {
			System.out.print(i);
			i++;
		}
		
		System.out.println("\n--------------");
		//5 4 3 2 1 출력
		i = 5;
		while(i>0) {
			System.out.print(i);
			i--;
		}
		
		System.out.println("\n--------------");
		//1부터 100까지의 합
		i = 1;
		int sum = 0;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
