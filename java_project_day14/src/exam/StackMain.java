package exam;

import java.util.Arrays;
import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기 입력>> ");
        int size = input.nextInt();
        input.nextLine();// 버퍼비우기
        StringStack ss = new StringStack(size);

        String inputText;

        while(true){
            System.out.print("문자열 입력(\"end\" 입력시 반복종료)>> ");
            inputText = input.nextLine();

            if(inputText.equals("end")){break;}
            if(!ss.push(inputText)){
                System.out.println("스택치 꽉 차서 푸시불가! ");
            }
        }

        System.out.print(Arrays.toString(ss.stack));


    }
}
