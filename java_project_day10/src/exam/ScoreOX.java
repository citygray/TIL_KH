package exam;

import java.util.Arrays;

/*
 * 다음과 같이 주어진 데이터를 이용해서 ScoreOX 클래스를 통해서 실행결과와 같이 나올 수 있도록 구현하시오.
 * 번호(no), 이름(name), 1~5번의 입력 답(dap[]), 답의 개수를 체크하는 cnt를 이용하여 
 * 점수(score)를 매기고 맞는 전체 개수를 체크하는 static 변수인 tot를 이용한다.
 * 또한 생성자를 이용하여 번호, 이름, 답을 받아 객체를 생성하고 
 * compute() 메서드에서는 정답{1,1,1,1,1}과 입력한 데이터가 맞으면 개수와 전체 개수를 체크하여 display() 메서드로 각 내용을 출력한다. 
 * 마지막으로 static 메서드인 ranking() 메서드에서는 5명의 ScoreOX의 객체를 배열로 받아 순위를 구한다.
 */
	


public class ScoreOX {
	private int no;
	private String name;
	private int[] dap;
	private int cnt;
	private int score;
	private int rank;
	private char[] c_OX = new char[5];
	public static int tot;
	public static final int[] JUNGDAP = {1,1,1,1,1};
	
	public ScoreOX(){}
	public ScoreOX(int no,String name,int[] dap){
		tot = 0;
		this.no = no;
		this.name = name;
		this.dap = dap;
	}
	
	//정답{1,1,1,1,1}과 입력한 데이터가 맞으면 개수와 전체 개수를 체크
	public void compute() {
		for(int i = 0;i<dap.length;i++) {
			if(JUNGDAP[i]==dap[i]) {
				c_OX[i] = 'O';
				tot++;
				cnt++;
			}else {
				c_OX[i] = 'X';
			}
		}
		score = cnt*20;
	}
	
	public void display() {
		//1	홍길동 O x O x x 40 
		//System.out.println(score);
		System.out.printf(" %d  %s  %c  %c  %c  %c  %c  %d\n",no,name,c_OX[0],c_OX[1],c_OX[2],c_OX[3],c_OX[4],score);
	}
	
	public static void ranking (ScoreOX[] sc) {
		int[] Arr1 = {40,100,60,80,20};
		int[] rankArr = new int[sc.length]; 
		for(int i =0;i<sc.length-1;i++) {
			if(Arr1[i]>Arr1[i+1]) {
				int temp=0;
				temp = Arr1[i];
				Arr1[i] = Arr1[i+1];
				Arr1[i+1] = temp;
			}
		}
		
		System.out.println(Arrays.toString(Arr1));
	}
	
}
