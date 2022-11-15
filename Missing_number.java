
public class Missing_number {

	public static void main(String[] args) {
		int x[]= {1,2,3,5,6,7,8,9};
		int sum1=0;
		int sum2=0;
		int sum3=0;
		for (int i = 0; i <= x.length-1; i++) {
			sum1=sum1+x[i];
			
		}System.out.println(sum1);
		for (int i = 0; i <=9; i++) {
			sum2=sum2+i;
			
		} System.out.println(sum2);
		sum3=sum2-sum1;
		System.out.println("Missing number is-"+sum3);
		
	}
}
