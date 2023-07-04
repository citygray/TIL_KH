package example;



public class MinAndMax {
	public int max(int[] arr) {
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
	}
	
	public int min(int[] arr) {
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		return min;
	}

}
