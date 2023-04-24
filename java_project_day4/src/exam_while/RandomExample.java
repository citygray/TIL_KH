package exam_while;

public class RandomExample {

	public static void main(String[] args) {
		/*
		 * 난수란 정의된 범위 내에서 무작위로 추출된 수를 일컫는다.
		 * Math.random()  0~1사이의 실수 값 반환
		 */
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*10)+1);
		
		int num = (int)(Math.random()*6)+1;
		System.out.println("주사위:"+ num);
	}

}
