import java.util.Iterator;

public class Vowels_Consonents {
@SuppressWarnings("unused")
public static void main(String[] args) {


	String x= "fjhagiekf";
	
	for (int i =0; i < x.length()-1; i++) {
		if(x.charAt(i)=='a'||x.charAt(i)=='e'||x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
		{
			System.out.println("vowels="+x.charAt(i));
		}
		else {
			System.out.println("consonents="+x.charAt(i));
		}
		
	}
}
}

