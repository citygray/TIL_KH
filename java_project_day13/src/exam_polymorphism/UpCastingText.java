package exam_polymorphism;

//상위 클래스
class Shape {
	String name;
	
	Shape(){};
	
	Shape(String name){
		this.name = name;
	}
}

//하위클래스
class Square extends Shape{
	Square(String name){
		super(name);
	}
}
class Triangle extends Shape{
	Triangle(String name){
		super(name);
	}
}
class Circle extends Shape{
	Circle(String name){
		super(name);
	}
}




public class UpCastingText {

	public static void main(String[] args) {
//		Square s = new Square();
//		s.name = "정사각형";
//		
//		Triangle t = new Triangle();
//		t.name = "삼각형";
//		
//		Circle c = new Circle();
//		c.name = "원";
//		
//		Shape[] shapes = {s,t,c};
		
		Shape[] shapes = {
				new Square("점사각형"),
				new Square("삼각형"),
				new Square("원")
		};
		
		
		for(int i = 0; i< shapes.length;i++) {
			System.out.printf("%d번 인텍스의 도형은: %s\n",i,shapes[i].name);
		}

	}

}
