package test;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 요구사항
		 * x개의 사탕을 y명의 학생들에게 똑같이 나누어주려고 할때,
		 * 각 학생들이 받을 수 있는 사탕의 수와 남은 사탕의 수를 계산해 출력하는 프로그램을 작성하시오
		 */
		
		int x,y,share,remaind;
		
		Scanner input = new Scanner(System.in);
		System.out.println("사탕 갯수?");
		x = input.nextInt();
		System.out.println("사탕 먹고 싶은 사람 몇명?");
		y = input.nextInt();
		
		share = x/y;
		remaind = x%y;
		
		System.out.printf("각각 %d 개의 사탕을 먹을 수 있고, %d 개가 남았다",share,remaind);
		
		input.close();

	}

}
