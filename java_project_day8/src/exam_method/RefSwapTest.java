package exam_method;

class RefSwap{
	public int x;
	
	public void change(RefSwap rs2) {//참조형 값 전달 
		System.out.println("\nBefore Change x = "+rs2.x);
		rs2.x = 200;
		System.out.println("After Change x = "+rs2.x);
	}
}
public class RefSwapTest {

	public static void main(String[] args) {

		RefSwap rs = new RefSwap();
		rs.x = 10;
		System.out.println("Main Before Calling x = "+rs.x);
		
		rs.change(rs);
		System.out.println("After Before Calling x = "+rs.x);
		
	}

}
