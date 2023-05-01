package exam_singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// 4. 실제 사용하는 코드 만들기
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		//두변수가 같은 지 확인
		System.out.println(myCompany1==myCompany2);

	}

}
