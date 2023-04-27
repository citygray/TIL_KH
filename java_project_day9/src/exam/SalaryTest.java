package exam;

public class SalaryTest {
	
	
	public static void main(String[] args) {
		/*
		[요구사항 2]
		사번과 기본급을 입력해서, 수당, 세금, 본봉, 등급을 저장하기 위한 사원 정보 클래스를 작성하여 다음과 같이 조건에 맞게 결과를 출력하려고 한다. 
		객체배열을 활용을 사용하여 아래 결과를 출력한다.
		그리고 모든 필드마다 설정자와 접근자를 다 생성할 필요는 없으며 필요에 따라 설정자와 접근자를 적절하게 명시해 주시면 됩니다.
		
		main() 메서드를 실행하여 다음의 결과를 얻을 수 있도록 구현하시오.
		
		[조건]
		1. 수당은 기본급의 15%
		2. 세금은 기본급의 20%
		3. 본봉은 기본급 + 수당 - 세금
		4. 등급은 본봉이 500000 이상이면 관리자 나머지는 영업으로 계산한다.
		5. 각 멤버 변수명은 사번(empno), 기본급(gi), 수당(su), 세금(se), 본봉(bong), 등급(grad)으로 지정한다.
	 */
		
		/*
		 객체배열
		- 참조 변수들을 하나로 묶는 참조 변수 배열
		Tv[] tvArr = {new Tv(),new Tv(),new Tv()};
		 */
		
		//Alll 	| 780000 | 117000 | 156000 | 741000 | 관리자
		
		System.out.println("\t\t\t봉급계산서");
		System.out.println("=====================================================");
		System.out.println(" 사번\t기본급\t  수당\t  세금\t   본봉\t   등급");
		System.out.println("=====================================================");
		
		Salary[] salarys = {
				new Salary("A111",780000),
				new Salary("B222",450000),
				new Salary("C333",570000),
		};
		for(int i =0;i<salarys.length;i++) {
			salarys[i].calsAllSalary();
		}
		
		for(int i =0;i<salarys.length;i++) {
			System.out.println(salarys[i].toString());
		}

	}
	
	

}
