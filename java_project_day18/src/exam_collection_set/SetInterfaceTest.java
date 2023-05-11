package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetInterfaceTest {

	/*
	 * HashSet 결과 : [Ham, Butter, Cheese, Milk, Bread]
	 * LinkedHashSet 결과 : [Milk, Bread, Butter, Cheese, Ham]
	 * TreeSet 결과: [Bread, Butter, Cheese, Ham, Milk]
	 * 
	 * */
	public static void main(String[] args) {
		//HashSet <String> set = new HashSet<String>();
		//LinkedHashSet<String> set = new LinkedHashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Milk");
		set.add("Bread");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set.toString());
		
		//반복자
		/*
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		//<Integer>타입은 LinkedHashSet 오류남
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		
		set1.add(Integer.valueOf(3));
		set1.add(5);
		set1.add(3);
		set1.add(4);
		
		System.out.println(set1.toString());
		
		
		
	}

}
