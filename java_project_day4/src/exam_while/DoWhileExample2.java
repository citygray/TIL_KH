package exam_while;

public class DoWhileExample2 {

	public static void main(String[] args) {
		/*do-while문을 이용하여 'a'부터 'z'까지 출력하는 프로그램을 작성하시오
		 * a: 97
		 * z: 122
		 * */

		int num = 97;
		
		do{
			String str = (num==122)? (char)num+"":(char)num+",";
			System.out.print(str);
			num++;
		}while(num<123);

	}

}
