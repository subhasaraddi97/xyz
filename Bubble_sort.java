import java.util.Arrays;

public class Bubble_sort {
	public static void main(String[] args) {
		int[] x= {1,34,2,54,65,76,8,1};
		
		
		
		for(int i = 0;i<x.length-1;i++) {
			for (int j = 0; j <x.length-1; j++) {
				if (x[j]>x[j+1]) {
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
					
				}
				
			}
			
		}System.out.println("sorted array-"+Arrays.toString(x));
	}

}
