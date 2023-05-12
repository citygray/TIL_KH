package exam_map;

import java.util.HashMap;

//문자열에 포함된 단어의 빈도를 계산하여 단어를 Key로 빈도를 value로 저장하여 출력해보자


public class WordFreq {
	public static void main(String[] args) {

	String[] sample = {"to","be","or","not","to","be","is","a","problem"};
	
	HashMap<String,Integer> dic = new HashMap<String,Integer>();

	//내가 코딩
	/*
	for(int i =0;i<sample.length;i++) {
		if(dic.containsKey(sample[i])) {
			
			int count = dic.get(sample[i])+1;
			dic.put(sample[i],count);
			
		}else {
			dic.put(sample[i],1);	
		}
	}
	
	System.out.println(dic.toString());
	*/
	
	//선생님 코딩
	for(String a: sample) {
		Integer freq = dic.get(a);
		dic.put(a, (freq==null)? 1: freq +1);
	}
	System.out.println(dic.toString());
	
	}
}
