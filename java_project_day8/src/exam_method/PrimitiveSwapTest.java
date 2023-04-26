package exam_method;

class PrimitiveSwap{
	public void change(int x,int y) {//기본형 매개변수 전달
		System.out.println("\nBefore Change X= "+x+" Y= "+y);
		int temp = x;
		x =y;
		y= temp;
		System.out.println("After Change X= "+x+" Y= "+y);
	}
}

public class PrimitiveSwapTest {

	public static void main(String[] args) {
		PrimitiveSwap ps = new PrimitiveSwap();
		
		int x = 10;
		int y = 20;
		System.out.println("\n호출전 Main X= "+x+" Y= "+y);
		ps.change(x, y);
		System.out.println("\n호출후 Main X= "+x+" Y= "+y);

	}

}
