
public class Search_elemnets_in_array {
	public static void main(String[] args) {
		int x[]= {1,4,3,76,87,97,340};
		int search=76;
		
		for (int i=0; i<x.length; i++) {
			if(search==x[i]) {
				
				System.out.println("searched eleent is--"+x[i]);
				System.out.println("index number is--"+i); 
			
			}
			
			
		}
		
	}

	
}
