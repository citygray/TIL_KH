package exam_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30};
		
		System.out.println("number[0] = "+numbers[0]);
		System.out.println("number[1] = "+numbers[1]);
		System.out.println("number[2] = "+numbers[2]);
		System.out.println();
		
		//기본형배열요소는 기본값으로 초기화된다.
		double[] arrayDouble = new double[2];
		for(int i = 0;i<arrayDouble.length;i++) {
			System.out.println("arrayDouble["+i+"]"+arrayDouble[i]);
		}
		System.out.println();
		
		String[] arrayString = new String[3];
		arrayString[0] = "java";
		arrayString[1] = "oracle";
		arrayString[2] = "spring";
		
		for(int i=0; i<arrayString.length;i++) {
			System.out.println("arrayString["+i+"] = "+arrayString[i]);
		}
		System.out.println();

	

		
		// 5명의 국어점수는 배열에 초기화 하고 영어점수는 입력을 받아 배열에 저장하여 출력하는 프로그램을 작성하시오.
		
		int[] kor = {100,80,50,90,60};
		int[] eng = new int[5];
		
		Scanner input = new Scanner(System.in); 
		
		for(int i=0;i<eng.length;i++) {
			System.out.println("영어점수를 입력하시오");
			eng[i] = input.nextInt();
		}

		//향상된 for
		for(int score: eng) {
			System.out.print(score+",");
		}
		System.out.println();
		
		System.out.println("국어점수는: "+Arrays.toString(kor));
		System.out.println("영어점수는: "+Arrays.toString(eng));
	
		input.close();
	}

}
