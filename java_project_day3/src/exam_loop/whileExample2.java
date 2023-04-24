package exam_loop;

import java.util.Scanner;

public class whileExample2 {

	public static void main(String[] args) {
		/*-1이 입력 될때 까지 정수를 입력받아 그 수들의 합을 출력하는 프로그램을 작성하시오*/
		Scanner input = new Scanner(System.in);
		int num=0,sum=0;
		//do-while
//		do {
//			System.out.println("정수값을 입력하시오(종료:-1)");
//			num = input.nextInt();
//			if(num!=-1)sum += num; //조건이 반복된다.비효율
//		}while(num != -1);
		
		//while
		while(true) {
			System.out.println("정수값을 입력하시오(종료:-1)");
			num = input.nextInt();
			if(num==-1) break;
			sum += num;
		}
		
		System.out.println("sum: "+sum);
		System.out.println("종료!");
		input.close();
	}

}
