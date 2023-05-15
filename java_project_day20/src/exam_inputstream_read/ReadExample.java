package exam_inputstream_read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) {
		// try-catch-finally 블록 이용한 예외처리
		InputStream is = null;
		try {
			is = new FileInputStream("C:/Temp/test.txt");
			System.out.println("[읽어 들인 문자]");

			/*
			int readByte;
			while(true) {
				readByte = is.read();
				if(readByte == -1) break;
				System.out.println((char)readByte);
			}
			*/
			
			int i;
			while((i= is.read())!=-1) {
				System.out.println((char)i);
			}
			
			
			
			int readByteNo;
			byte[] readBytes = new byte[4]; // 한번에 읽어 오는 글자수
			
			String data = "";
			
			while(true) {
				readByteNo = is.read(readBytes); //읽어들인 바이트 값을 바이트 배열에 저장하고 그 바이트 수를 반환.
				System.out.println("읽은 바이트 수: "+ readByteNo);//확인
				if(readByteNo==-1)break;
				data += new String(readBytes,0,readByteNo); //new String(배열, 시작인텍스,길이)
			}
			
			System.out.println(data);
			
			/*
			int readByteNo;
			byte[] readBytes = new byte[10];
			
			//read 바이트 배열에 저장할 길이수는 5이고 배열의 저장위치는 2번째부터
			readByteNo = is.read(readBytes,2,5);
			System.out.println("리턴 바이트 수: "+readByteNo);
			
			for(int i =0; i<readBytes.length;i++) {
				System.out.println((char)readBytes[i]);
			}*/
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			try {
				if(is != null) {//인스턴스 생성이 정상적으로 이루어지면 is는 주소값을 가짐
					is.close();
				} 
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
