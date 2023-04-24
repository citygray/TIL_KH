package exam_char;

public class CharExample {
    public static void main(String[] args){
        // 문자를 직접 저장(소문자 a는 97)
        char c1 = 'A';

        // 십진수로 저장
        char c2= 65;

        // 16진수로 저장
        char c3 = '\u0041';

        // 문자를 직접 저장
        char c4 = '가';

        // 십진수로 저장
        char c5= 44032;

        // 16진수로 저장
        char c6 = '\uac00';

        //유니코드 얻기
        int unicode = c1;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println("int형 변수에 대입후: "+unicode);

        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);



    }
}
