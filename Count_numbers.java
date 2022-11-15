
public class Count_numbers {

	
	public static void main(String[] args) {
	int x=12345;
	int count=0;
	while(x>0) {
		x=x/10;
		count++;
	}
	System.out.println(count);
	}
}

