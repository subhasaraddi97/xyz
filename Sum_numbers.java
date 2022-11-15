
public class Sum_numbers {
  public static void main(String[] args) {
     int x=487876492;
     int sum=0;
	  
	  while(x>0) {
		  sum=sum+x%10;
		  x=x/10;
	  }System.out.println(sum);
}
}

