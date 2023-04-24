package exam_while;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		/*
		 * 이 예제는 숫자를 알아맞히기 게임이다.
		 * 프로그램은 1부터 10사이의 임의의 정수값 하나를 저장하고 
		 * 사용자는 질문을 통하여 그 정수를 알아맞히려고 노력한다.
		 * 
		 * 사용자가 답을 제시하면 프로그램은 자신이 정한 정수와 비교 하여 
		 * 정수가 더 높은지 낮은지만을 알려준다.
		 * 
		 * 프로그램은  do-while문을 사용하여 사용자가 정확하게 알아맞힐 때까지 반복한다.
		 * 사용자가 정답을 알아맞히면 몇 번 만에 알아맞혔는지를 화면에 출력하는 프로그램을 작성해 주세요.
		 * */
		
		int myNum = (int)(Math.random()*10)+1;
		int yourNum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("myNum : "+myNum);
		/*
		do {
			System.out.println("1~10사이에 값을 맞쳐보시지~");
			yourNum = input.nextInt();
			if(yourNum!=myNum) {
				String str;
				str = (yourNum>myNum)?"up":"down";
				System.out.println(str);
			}
			
		}while(yourNum!=myNum);
		
		*/
		
		String str;
		
		while(true) {
			System.out.println("1~10사이에 값을 맞쳐보시지~");
			yourNum = input.nextInt();
			if(yourNum==myNum) {
				str = "U win!";
				break;
			} 
			str = (yourNum>myNum)?"down":"up";
			System.out.println(str);
		}
		
		System.out.println(str);
		input.close();
		
	}

}
