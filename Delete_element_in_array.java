
public class Delete_element_in_array {
	public static void main(String[] args) {
		int[] x= {2,3,5,4,7,6,8,9};
		int delete=x[2];
		for (int i = 0; i < x.length; i++) {
			if(delete!=x[i]) {
				System.out.print(x[i]);
			}
		}
		
	}

}
