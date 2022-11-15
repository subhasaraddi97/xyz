import java.util.Iterator;

public class Prime_number {
	public static void main(String[] args) {
		int x=73;
		int count=0;
		
		
		for (int i = 1 ; i <=x; i++) {
			if(x%i==0)
				count++;
		}
		if(count==2) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}
		}
	
	}


