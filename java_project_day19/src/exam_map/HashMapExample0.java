package exam_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample0 {

	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<String,String>();
		
		//put(key,value): 원소 추가
		dic.put("고진감래","고생 끝에 즐거움이 옴");
		dic.put("분골쇄신","몸이 부서질 정도로 노력을 다함");
		dic.put("권토중래", "실패를 발판 삼아 재기함");
		dic.put("교학상자", "가르치고 배우면서 서로 성장함");
		//dic.put(null, null); //HashMap은 null 값 저장 가능
		
		//get(key) : 특정 키의 value를 반환하는 메서드
		System.out.println(dic.get("고진감래"));
		System.out.println();
		
		//size() :  원소의 수 반환
		System.out.println("총 Entry 수: "+ dic.size());
		
		//remove(key) : 특정 키를 기준으로 데이터(객체) 삭제
		dic.remove("교학상자");
		System.out.println("총 Entry 수: "+ dic.size());
		
		System.out.println(dic.toString()); //Map의 toString(): {key=value, key=value...} 형태로 반환
		System.out.println();
		
		//방법1 - 객체를 하나씩 처리
		Set<String> keySet = dic.keySet();
		Iterator<String> keys = keySet.iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s : %s",key,dic.get(key)));
		}
		System.out.println();
		
		//방법2 
		for(String key :dic.keySet()) {
			System.out.println(String.format("%s : %s",key,dic.get(key)));
		}
		System.out.println();
		
		//방법3 - 키와 값의 한쌍으로 구성된 객체를 set에 담아서 리턴
		//entrySet()메서드는 키와 값의 한쌍으로 구성된 객체(Map.Entry)를 set에 담아서 리턴
		Set<Map.Entry<String,String>> entrySet = dic.entrySet(); 
		Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, String> entry = entryIterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key +" : "+value);
		}
		System.out.println();
		
		//방법4
		for(Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.printf("%s : %s\n",elem.getKey(),elem.getValue());
		}
		
		
	}

}
