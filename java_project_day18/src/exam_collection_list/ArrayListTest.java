package exam_collection_list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// 프로그래밍 언어(문자열)를 저장하도록 인스턴스 생성
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Java");
		list.add("JSP");
		list.add("SPRING");
		
		int size = list.size();
		System.out.println("총 객체수: "+ size);
		System.out.println();
		
		list.add(1,"ORACLE");
		list.set(2, "Client Programing");
		list.remove(3);
		
		int index = list.indexOf("Java");
		System.out.println(index);
		
		index = list.lastIndexOf("Java");
		System.out.println(index);
		
		for(String e :list) {
			System.out.println(e);
		}
		
		System.out.println();
		
		// 정수값을 저장하도록 인스턴스 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(23);
		list1.add(Integer.valueOf(94));
		list1.add(Integer.valueOf(62));
		list1.add(Integer.valueOf(45));
		
		System.out.println(list1.toString());
		
		list1.add(2,Integer.valueOf(78));
		System.out.println(list1.toString());
		System.out.println();
		
		
		
		
		
		
	}

}
