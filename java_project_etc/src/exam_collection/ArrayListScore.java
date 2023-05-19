package exam_collection;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListScore {

	public static void main(String[] args) {
		/*
		 * Scanner클래스를 사용하여 6개 학점('A','B','C','D','F')을 문자로 입력받아 ArrayList에 저장하고,
		 * ArrayList를 검색하여 학점점수를 (A=4.0,B=3.0,C=2.0,D=1.0,F=0)로 변환하여 평균을 출력하는 프로그램을 작성해라
		 *
		 * [실행결과]
		 * 
		 * 6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>A C A B F D 2.33
		 */

		
		int sum = 0;
		ArrayList<Character> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		// Scanner클래스를 사용하여 6개 학점('A','B','C','D','F')을 문자로 입력받아 ArrayList에 저장
		while (true) {
			System.out.println("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F/F)>>");
			String[] arr = sc.next().split("/");

			// 유효성 체크 - 학점 갯수
			if (arr.length != 6) {
				System.out.println("입력 갯수 확인해주세요");
				continue;
			}

			for (String item : arr) {
				char charItem = item.charAt(0);
				// 유효성 체크 - 학점 값
				if (item.length() > 1 || charItem < 'A' || 'F' < charItem || charItem == 'E') {
					System.out.println("입력양식에 맞이 않습니다");
					System.out.println("학점을 다시입력하세요");
					break;
				}
				list.add(charItem);
			}
			if (list.size() == 6) {
				System.out.println("정보입력이 정상 처리 되었습니다.");
				break;
			}
		}

		sc.close();
		
		// 학점점수를 (A=4.0,B=3.0,C=2.0,D=1.0,F=0)로 변환하여 평균을 출력
		for(Character gr :list) {
			System.out.println(gr);
			switch(gr) {
				case 'A':
					sum+=4;
					break;
				case 'B':
					sum+=3;
					break;
				case 'C':
					sum+=2;
					break;
				case 'D':
					sum+=1;
					break;
				case 'F':
					sum+=0;
					break;
			}
		}

		System.out.println("총점: "+sum);
		System.out.printf("평균: %.2f",sum/6.0);

	}

}
