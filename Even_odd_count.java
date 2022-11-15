
//find even and odd numbers
public class Even_odd_count {
public static void main(String[] args) {
	int x=12645844;
	
	int even=0;
	int odd=0;
	while(x>0) {
		int sum=x%10;
		if(x%2==0) {
			even++;
		}
		else {
			odd++;
		}
		x=x/10;
		
	}
	System.out.println(even);
	System.out.println(odd);
}
}

