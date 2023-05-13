package exam_collection_list.javajungsuk;

import java.util.*;

public class Ex11_1 {
    public static void main(String[] args) {
        //기본 길이(용량,capacity)가 10인 ArrayList생성
        ArrayList list1 = new ArrayList(10);
        list1.add(Integer.valueOf(5));
        list1.add(Integer.valueOf(4));
        list1.add(Integer.valueOf(2));
        list1.add(Integer.valueOf(0));
        list1.add(Integer.valueOf(1));
        list1.add(Integer.valueOf(3));

        ArrayList list2 =  new ArrayList(list1.subList(1,4));
        print(list1,list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1.containsAll(list2): "+ list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list1,list2);
        System.out.println("list1.containsAll(list2): "+ list1.containsAll(list2));

        //  ArrayList에서 저장괸 첫번째 객체부터 삭제하는 경우 (배열복사발생)
//        for(int i = 0; i<list2.size();i++){
//            list2.remove(i);
//        }

        for(int i = list2.size()-1;i>=0;i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }

        print(list1,list2);

        list1.remove(Integer.valueOf(1));
        System.out.println(list1);
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
