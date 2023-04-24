package exam_array_in_array;

public class Rainfall {

	public static void main(String[] args) {
		double[][] rainData = {
				{368.1,173.9,172.8},
				{586.5,493.0,1012.4},
				{351.2,448.4,259.4},
				{66.5,168.1,46.7}
		};
		
		System.out.printf("\t%5d\t%5d\t%5d\n",2018,2019,2020);
		for(int i =0;i<rainData.length;i++) {
			System.out.print(i+1+"분기\t");
			for(int j =0; j<rainData[i].length; j++) {
				System.out.printf("%.1f\t",rainData[i][j]);
			}
			System.out.println();
		}

		System.out.println("---------------------------------------------");
		
		System.out.println("년도	1분기	2분기	3분기	4분기	종합");
		System.out.println("---------------------------------------------");
		
		final int year = 2018;
		double sum;
		for(int i=0; i<rainData[0].length;i++) {
			System.out.print(year+i+"년도 ");
			sum = 0;
			for(int j =0; j<rainData.length;j++) {
				System.out.print(rainData[j][i]+"\t");
				sum += rainData[j][i];
			}
			System.out.printf("%.1f\t",sum);
			System.out.println();
		}
		
	}

}
