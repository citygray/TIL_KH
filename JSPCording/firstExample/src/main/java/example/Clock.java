package example;

import java.text.SimpleDateFormat;
import java.util.Date;
/* 웹에서 클래스를 접근하기 위해서는 반드시 패키지 설정이 선행되어야한다. 디폴트 패키지 불가능 */
public class Clock {
	public String now() {
		Date nowDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 DD일 HH시 mm분 ss 초");
		return dateFormat.format(nowDate);	
	}
}
