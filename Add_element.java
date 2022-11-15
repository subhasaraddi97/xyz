import java.util.Iterator;

public class Add_element {
	public static void main(String[] args) {
		int[] x={1,4,3,6,5,8};
		int indexnumber=3;
		int element=8;
		for (int i =x.length-1; i >=indexnumber; i--) {
			x[i]=x[i-1];
		
			
		}
		x[indexnumber]=element;
		for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);	
		}
		
		}
		}


