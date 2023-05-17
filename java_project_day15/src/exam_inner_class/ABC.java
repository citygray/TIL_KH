package exam_inner_class;

public class ABC {
	//예제 클래스 인 동시에 실행 클래스
	private String msg = "A";
	public void print() {
		BC bc = new BC();
		bc.print();
	}
	public class BC{
		private String msg = "B";
		public void print() {
			C c = new C();
			c.print();
		}
		
		public class C{
			private String msg = "C";
			public void print() {
				System.out.println("msg: "+msg);
				System.out.println("this.msg: "+this.msg);
				System.out.println("C.this.msg: "+C.this.msg);
				System.out.println("BC.this.msg: "+BC.this.msg);
				System.out.println("ABC.this.msg: "+ABC.this.msg);
			}
		}
	}
	
	public static void main(String[] args) {
		ABC abc = new ABC();
		abc.print();
		System.out.println("-------------------------------");
		ABC.BC.C c= abc.new BC().new C();
		c.print();
	}

}
