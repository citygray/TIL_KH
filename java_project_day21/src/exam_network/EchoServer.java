package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	/*
	 * 클라이언트에서는 한 줄씩 텍스트를 입력받아 서버로 보내고 서버는 받은 텍스트를 출력하는 소켓프로그램을 작성하라
	 * 전송하면 클라이언트와 서버 모두 연결을 끊고 종료*/
	public static void main(String[] args) {
		BufferedReader in = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		System.out.println("서버입니다.클라이언트를 기다립니다....");
		
		try {
			listener = new ServerSocket(9999);//서버 소켓 생성
			socket = listener.accept();//클라이언트로 부터 연결 요청 대기
			System.out.println("연결 되었습니다.");
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));// 클라이언트로 부터의 입력스트림
			String inputMessage;
			while(true) {
				inputMessage = in.readLine();
				if(inputMessage.equals("끝")) {
					System.out.println("접속을 종료합니다.");
					break;
				}
				System.out.println("..."+inputMessage);//클라이언트가 보낸 메시지 화면에 출력
			}
			socket.close();//클라이언트와 통신용 소켓닫기
			listener.close();//서버 소켓닫기
		}catch(IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}

}
