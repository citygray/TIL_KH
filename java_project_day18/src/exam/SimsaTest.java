package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 장기자랑 프로그램에 사용될 수 있눈 심사위원들의 점수를 집계하는 프로그램을 작성하라
 * 점수는 0.0에서 10.0까지 가능하다. 10명의 점수 입력 받아 그 중에서 
 * 최고 점수(Collections.max(리스트의 참조변수))와
 * 최저 점수(Collections.min(리스트의 참조변수))는 제외한다.
 * Double 타입의 ArrayList를 사용하라*/


public class SimsaTest {
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		// 입력단계
		int i = 1;
		double value = 0.0;
		
		while(true) {
			System.out.printf("%d번째 심사위원점수 : ",i);
			value =  input.nextDouble();
			
			if(value<0 || value>10) {
				continue;
			}
			list.add(value);
			i++;
			if(i>10){break;}
		}
		input.close();
		
		//처리 및 출력 단계
		double max = Collections.max(list);
		double min = Collections.min(list);
		double sum = 0.0;
		
		
				
		for(Double score:list) {
			if(score==max||score==min) {continue;} 
			sum += score;
		}
		System.out.println("집계 : "+sum);
	}
	
}