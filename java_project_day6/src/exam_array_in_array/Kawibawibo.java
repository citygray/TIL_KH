package exam_array_in_array;

import java.util.Scanner;

public class Kawibawibo {

	public static void main(String[] args) {
		/*
		 * Math.random()의 난수 발생기를 이용하여 사용자와 컴퓨터가 하는 가위바위보 게임을 만들어보자.

			가위, 바위, 보는 각각 1,2,3 키이다. 
			사용자가 1, 2, 3 키 중 하나를 입력하면 동시에 프로그램도 난수 발생기를 이용하여 1, 2, 3중에 한 수를 발생시킨다.
			그리고 사용자와 컴퓨터 둘 중 누가 이겼는지를 판별하여 승자를 출력하라. 
			게임은 반복되도록 작성한다.(종료는 4으로 설정한다)
			​
			
			[실행화면]
			가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>1
			컴퓨터는 가위를 냈습니다.
			비겼습니다.
			가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>4
			프로그램을 종료합니다.
		 */
         int[] winNum = {2,3,1};
         Scanner input = new Scanner(System.in);
         int your;
         
         while(true) {
        	 int randomNum = (int)(Math.random()*3+1);
        	 System.out.println("가위(1), 바위(2), 보(3), 끝내기(4) 중 하나를 선택하세요>>");
        	 your = input.nextInt();
        	 
        	 if(your==4) {
        		 System.out.println("프로그램을 종료합니다.");
        		 break;
        	 }
        	 
        	 if(your<0||3<your) {
        		 System.out.println("엉뚱한 걸 냈어");
        		 continue;
        	 }
        	 if(your==randomNum) {
        		 System.out.println("비겼습니다.");
        		 continue;
        	 }
        	 if(your==winNum[randomNum-1]) {
        		 System.out.println("이겼습니다.");
        	 }else {
        		 System.out.println("졌습니다.");
        	 }
         }
         input.close();

	}

}
