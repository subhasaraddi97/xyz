import java.util.StringTokenizer;

public class Split_Date_of_birth {
	public static void main(String[] args) {
		int count=0;
		StringTokenizer s =new StringTokenizer("17/08/1998","/");// delimit(/) should be add while date of birth
		while(s.hasMoreTokens()) {
			System.out.println(s.nextToken());
			count++;
			
		}
		System.out.println("nfiugf="+count);
		
	}

}
