package exam_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


class StudentData{
	private int id;
	private String tel;
	
	public StudentData(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return String.format("id:%d, 전화:%s", id,tel);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentData) {
			StudentData studentData = (StudentData) obj;

			if(this.tel.equals(studentData.tel) && this.id == studentData.id)
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return tel.hashCode() + id;
	}
	
	
	
}

public class HashMapStudentExample {

	public static void main(String[] args) {
		// StudentData 클래스는 아이디와 전화번호를 필드로 가진다.
    	// (학생 이름, StudentData 객체)를 저장하는 해시맵 생성한다.
		
		HashMap<String,StudentData> map = new HashMap<String,StudentData>();
		
		map.put("홍길동", new StudentData(1,"010-2502-2626"));
		map.put("이재문", new StudentData(2,"010-2502-1234"));
		map.put("김남윤", new StudentData(3,"010-2502-2345"));
		map.put("이재문", new StudentData(4,"010-2502-3456")); //키값은 중복 될 수 없어서 마지막에 삽입된 값으로 저장

		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			StudentData sst = map.get(key);
			System.out.println(key + " "+ sst.toString());
		}
		System.out.println();
		
		//참조형을 키값으로 설정
		HashMap<StudentData,String> map2 = new HashMap<StudentData,String>();
		
		map2.put(new StudentData(1, "010-1431-7643"), "홍길동"); // 3명의 학생 저장
        map2.put(new StudentData(2, "010-4315-4219"), "이재문");
        map2.put(new StudentData(3, "010-2453-3263"), "김남윤");
        map2.put(new StudentData(2, "010-4315-4219"), "이재문");

        Set<StudentData> keySet2 = map2.keySet();
		Iterator<StudentData> it2 = keySet2.iterator();
		
        while(it2.hasNext()) {
        	StudentData key = it2.next();
			String str = map2.get(key);
			System.out.println(key + " "+ str.toString());
		}
		System.out.println();
		
	}

}
