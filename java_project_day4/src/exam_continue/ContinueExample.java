package exam_continue;

public class ContinueExample {

	public static void main(String[] args) {
		/*
		 * 문자열 "no news is good news"을 대상으로 
		 * 반복하며 문자 'n'이 아니면 continue문에 의하여 루프의 나머지 부분을 생략하고 
		 * 다음 문자를 처리한다.
		 * 문자열 변수명.charAt(1)을 사용하면 문자열변수명에 저장된 문자열의 첫번째 문자 하나를 반환하다.
		 * */
		
		String str = "no news is good news";
		int count = 0;
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i)!='n') continue;
			count++;
		}
		System.out.println("n의 개수는? "+count);

	}

}
