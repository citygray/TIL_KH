package exam_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;

public class JavaFileOnly_byT {
	
	/*
	[ 요구사항 1]
	현재 디렉터리의 .java 확장자를 가지는 파일만을 출력하는 프로그램을 작성해보자.
	Test.java
	Sample.java
	총 2개의 파일이 발견되었습니다.

	[힌트]
	File 클래스의 list() 메서드와 문자열 클래스의 endsWith() 메서드를 고려해 보세요
	list() 메서드는 인자값으로 FilenameFilter 인터페이스의 구현클래스 주소값을 가질 수 있다.
	
	[ 요구사항 2]
	현재 디렉터리(./)의 .java 확장자를 가지는 파일에서 특정한 문자열을 검색하는 프로그램을 작성해보자.
	문자열이 있는 줄과 줄 번호를 함께 출력한다.
	*/

	public static void main(String[] args) throws IOException {
		File temp = new File("./"); //프로젝트 바로 아래 넣은 파일
				
		String[] contents = temp.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.toLowerCase().endsWith(".java")) {
					return true;
				}else {
					return false;
				}
			}
		});
		
		if(contents.length == 0) {
			System.out.println("존재하는 파일이 없습니다.");
		}else {
			for(String fileName : contents) {
				System.out.println(fileName);
			}
			System.out.println("\n총"+contents.length+"개의 파일이 발견되었습니다.");
		}
				
	
	}

}
