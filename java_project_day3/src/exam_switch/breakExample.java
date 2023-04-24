package exam_switch;

public class breakExample {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;

		while(true){
			if(sum>100) break; //break문이 수행되면 while문을 완전히 벗어난다.
		    i++;
		    sum += 1;
		}
		System.out.println("i는 "+i);
		System.out.println("sum는 "+sum);

	}

}
