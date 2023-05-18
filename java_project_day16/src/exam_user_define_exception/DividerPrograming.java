package exam_user_define_exception;

public class DividerPrograming {

	public static void main(String[] args) {
		double result;
		try {
			result = quotient(1,0);
		}catch (DivideByZeroException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static double quotient(int n,int d) throws DivideByZeroException{
		if(d==0) {
			throw new DivideByZeroException();//예외객체생성
		}
		return (double)n/d;
	}

}
