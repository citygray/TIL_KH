package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// 연산 메서드
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		
		s2.add("A");
		s2.add("D");
		
		Iterator<String> it = s1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2); //합집합
		
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);
		
				
		System.out.println("합집합 "+ union.toString());
		System.out.println("교집합 "+ intersection.toString());
	}

}
