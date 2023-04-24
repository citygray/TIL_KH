package exam_while;

import java.util.Scanner;

public class DoWhileExample1 {

public static void main(String[] args) {
		
		/*do- while문을 아래 요구사항을..*/
		/*
		int num = 0;
		do {
			System.out.println("num의 값: "+num);
			num++;
		}while(num<0);
		*/
		
		//1~10 출력
		/*
		int i =1;
		do {
			String str = (i==10)? i+"":i+",";
			System.out.print(str);
			i++;
		}while(i<=10);
		*/
		
		//10~1 출력
		/*
		int i = 10;
		do {
			String str = (i==1)? i+"":i+",";
			System.out.print(str);
			i--;
		}while(i>0);
		*/
		
		//1~100까지 합
		/*
		int i =1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i<=100);
		
		System.out.println(sum);
		*/
		
		//사용자에게 문자 및 숫자를 입력 받아서 출력하고자 한다. 이때 종료는 q를 입력하면된다.
		Scanner input = new Scanner(System.in);
		String what;
		do {
			System.out.println("문자 및 숫자를 입력하시오(종료:q)");
			what = input.next();
			System.out.println(what);
		}while(!what.equals("q"));
		System.out.println("종료!");
		
		input.close();
	
	}
}
