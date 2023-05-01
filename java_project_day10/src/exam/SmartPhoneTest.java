package exam;

public class SmartPhoneTest {

	public static void main(String[] args) {

		SmartPhone[] smartPhones = {
				new SmartPhone("삼성","갤럭시노트20",1594500),
				new SmartPhone("애플","iPhone 14",1364000,10),
				new SmartPhone("삼성","갤럭시S23",180000,25)
		};
		printSmartPhone(smartPhones);
	}

	//정보 출력 메서드
	public static void printSmartPhone(SmartPhone[] sP) {
		System.out.println("============= 제품목록 =================");
		System.out.println("--------------------------------------");
		for(int i=0;i<sP.length;i++) {
			System.out.printf("%s [%s]\n",sP[i].getName(),sP[i].getMaker());
			System.out.printf("가격 : %d\n",sP[i].getPrice());
			//할인율이 없을 경우
			if(sP[i].getDiscountRate()!= 0) {
				System.out.printf("할인가격(%d%%) : %d\n",sP[i].getDiscountRate(), sP[i].calculateDiscount());
			}
			System.out.println("--------------------------------------");
		}
	}

}
