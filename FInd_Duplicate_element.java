
public class FInd_Duplicate_element {
	public static void main(String[] args) {
		String x[]= {"xyz","abc","xyz","mno","abc"};
		
		for (int i = 0; i <= x.length-1; i++) {
			for (int j =i+1; j <= x.length-1; j++) {
				if(x[i]==x[j]) {
					System.out.println("duplicate element is-"+x[i]);
				}
				
			}
			
		}

	}
}
