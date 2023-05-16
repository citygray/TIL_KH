package exam_reader;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {
	public static void main(String[] args) throws Exception{
		//append true : 끝에 추가 / false: 덮어쓰기
		Writer writer = new FileWriter("test.txt");
		char[] data ="야호\n".toCharArray();
		
		//write(int c) 메서드
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
		}
		
		//writer.write(data); 
		//문자열 연결시 메모리공간이 계속 받아져서 메모리에 부하
		//--> 문자열을 버퍼공간에 추가하여 사용하여 부하 줄임
		StringBuffer sb = new StringBuffer();
		sb.append("신은 우리가 성공할 것을");
		sb.append("요구하지 않는다\n");
		sb.append("우리가 노력할 할 것을 요구할");
		sb.append("뿐이다.(마더 테레사)");
		
		writer.write(sb.toString());
		
		System.out.println("파일 출력완료");
		writer.flush();
		writer.close();
	}

}
