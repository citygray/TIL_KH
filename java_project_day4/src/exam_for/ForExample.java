package exam_for;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {
		// for문을 활용하여 요구사항에 맞게 작성하시오

		//1~10까지의 합
		/*
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합: "+sum);
		*/
		
		//for문을 이용해서 1부터 10까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보자.
		/*
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
			if(i%3==0)sum+=i;
		}
		System.out.println("1부터 10까지의 정수 중에서 3의 배수의 총합: "+sum);
		*/
	
		
		//10개의 숫자를 입력받아 0보다 큰 숫자에 대한 평균과 개수를 출력하는 코드를 작성하시오
		
		/*
		int count = 0, sum = 0;
		
	    Scanner input = new Scanner(System.in);
		for(int i =1; i<=3; i++) {
			System.out.println(i+"번째 숫자를 입력하세요");
			int num = input.nextInt();
			if(num>0) {
				sum+=num;
				count++;
			};
		}
		System.out.println("0보다 큰 숫자 개수: "+count);
		System.out.println("0보다 큰 숫자에 대한 평균: "+sum/count);
		
		input.close();
		*/
		
		
		
		// 10개의 데이터를 입력받아 최소값,최대값을 구하여 출력하는 코드
		int min=0 ,max=0;
		
	    Scanner input = new Scanner(System.in);
		for(int i =1; i<=3; i++) {
			System.out.println(i+"번째 숫자를 입력하세요");
			int num = input.nextInt();
			if(i==1) {
				max = num;
				min = num;
				continue;
			} 
			if(min>num) min = num;
			if(max<num) max = num;
		}
		
		System.out.println("최대값은 "+ max);
		System.out.println("최소값은 "+ min);
		
		input.close();
		
		
	}

}
