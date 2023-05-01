package exam_car;

public class CarMain {

	public static void main(String[] args) {
		Monata[] monatas = {
				new Monata("흰색",5000,"승용","NF"),
				new Monata("은색",7000,"업무","Brilliant"),
				new Monata("검정",4000,"택시","EF"),
				new Monata("감홍색",6000,"승용","Hybrid")
		};
		
		System.out.println("========================  Monata 생산시작  =========================");
		
		for(Monata monata: monatas) {
			System.out.println(monata.toString());
		}
	}

}
