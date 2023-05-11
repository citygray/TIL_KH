package exam;

import java.util.Arrays;

public class DictionaryMain {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("자바","홍익춯판사");
        dic.put("파이썬","한빛");
        dic.put("C++","이지스퍼블리싱");
        dic.put("SQL 개발자","길벗");

        System.out.println("자바의 출판사는 "+ dic.get("자바"));

        dic.delete("파이썬");

        System.out.println("파이썬의 출판사는 "+ dic.get("파이썬"));

        dic.printAllArray();
        System.out.println("현제 저장된 아이템의 개수 "+dic.length());


    }
}
