package gugudan;
/*
[요구사항]
구구단을 구현하기 위해 반복적으로 발생하는 부분이 있다.
반복적으로 발생하는 부분을 메소드를 활용해 반복되는 부분을 줄인다.

[힌트]
구구단 계산 결과를 배열에 담는 로직을 새로운 메소드로 분리한다.
배열에 담은 데이터를 화면에 출력하는 로직을 새로운 메소드로 분리한다.

*/


public class gugudanWithMethod {
    public static int[] calculate(int times) {
        int[] result = new int[9];

        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 배열에 저장
        	result[0] = times * (i+1);
        }

        return result;
    }

    public static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            // 계산 결과를 화면에 출력
        	System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        for (int j = 2; j < 10; j++) {
            // calculate와 print 메소드 활용해 구구단 구현하기
        	
        }
    }
}