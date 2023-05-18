package exam_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class FileExample_with_ArrayList {
	public static void main(String[] args) {
	
	Writer fw = null;
	BufferedReader br = null;
	Writer ofw = null;
	
	Random r = new Random();
	
	try {
		//문자 기반 출력 스트림 생성
		fw = new FileWriter("input.txt");
		for(int i =0;i<10;i++) {
			fw.write(String.valueOf(r.nextInt(300)));
			fw.write("\r\n");
		}
		fw.flush();
		
		//파일 읽어서 ArrayList에 담기
		ArrayList<Integer> list = new ArrayList<Integer>();
		br = new BufferedReader(new FileReader("input.txt"));
		while(true) {
			String line = br.readLine();
			if(line == null) break;
			int value = Integer.parseInt(line);
			list.add(value);
		}
		
		//컬렉션의 데이터를 오름차순으로 정렬
		Collections.sort(list);
		
		//파일에 출력
		ofw = new FileWriter("output.txt");
		final int listSize = list.size();
		for(int k =0; k<listSize;k++) {
			ofw.write(String.valueOf(list.get(k)));
			ofw.write("\r\n");
		}
		ofw.flush();
		System.out.println("파일이 정상적으로 복사되었습니다.");
		
	}catch(IOException io) {
		io.printStackTrace();
	}finally {
		try {
			if(fw != null) {fw.close();}
			if(br != null) {br.close();}
			if(ofw != null) {ofw.close();}
		}catch(Exception io) {
			io.printStackTrace();
		}
	}
	
	}
}
