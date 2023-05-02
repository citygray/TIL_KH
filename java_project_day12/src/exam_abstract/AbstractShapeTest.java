package exam_abstract;

public class AbstractShapeTest {

	public static void main(String[] args) {
//		Rectangle r = new Rectangle();
//		r.draw();
//		
//		Circle c = new Circle();
//		c.draw();
		
		Shape[] shapes = {
				new Rectangle(),
				new Circle()
		};
	
		shapes[0].draw();
		shapes[1].draw();

	}

}
