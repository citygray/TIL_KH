package exam_while;

import java.util.Scanner;

public class GugudanExample {

	public static void main(String[] args) {
		/*
		 * while문을 이용한 구구단 출력
		 * 구구단 중에 출력하고 싶은 단을 입력하시오
		 */
		Scanner input = new Scanner(System.in);
		int num = 2;
		do{
			System.out.println("구구단 중에 출력하고 싶은 단을 입력하시오");
			num = input.nextInt();
		}while(num<2 || 9<num);
		
		input.close();
		
		int i = 2;
		while(i<10) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
			i++;
		}

	}

}
