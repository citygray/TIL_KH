package exam_boolean;

public class BooleanExample {
	public static void main(String[] agrs) {
		//상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는데 사용
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		}else {
			System.out.println("시작합니다.");
		}
		
		int x = 10;
		boolean result1 = (x==20);
		boolean result2 = (x!=20);
		
		System.out.println("result1: "+ result1);
		System.out.println("result2: "+ result2);
	} 
}
