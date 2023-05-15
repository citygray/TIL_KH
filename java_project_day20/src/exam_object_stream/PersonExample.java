package exam_object_stream;

import java.io.*;
import java.util.Scanner;

/*
 * 이름(name)과 나이(age)를 필드로 가진 Person 클래스를 생성한다.
 * 사용자로 하여금 데이터를 입력받아 인스턴스를 생성한다. 
 * 그 데이터를 person.dat파일에 저장한다.
 * 
 * - person.dat 파일에 Person데이터를 저장 : output 메서드 생성
 * - person.dat 파일에서 데이터로 읽어서 Person 복원하여 출력 : input 메서드 생성
 * */

public class PersonExample {

	static ObjectInputStream in = null;
	static ObjectOutputStream out = null;

	public static void output(String name, int age) {

		try {
			out = new ObjectOutputStream(new FileOutputStream("person.dat"));
			out.writeObject(new Person(name, age));
			out.flush();
		} catch (IOException i) {

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void input() {
		try {
			in = new ObjectInputStream(new FileInputStream("person.dat"));
			Person ps = (Person) in.readObject();
			System.out.println(ps.toString());

		} catch (ClassNotFoundException c) {
			System.out.println(c.getMessage());
		} catch (IOException i) {

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("이름을 입력하세요");
		String name = input.nextLine();
		System.out.println("나이을 입력하세요");
		int age = input.nextInt();
		
		input.close();
		
		output(name,age);
		input();

	}

}
