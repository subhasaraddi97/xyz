import java.util.StringTokenizer;

public class Split_string {
public static void main(String[] args) {
	int count=0;
	StringTokenizer s=new StringTokenizer("subhasaradddi H m");
	while(s.hasMoreTokens()) {
		System.out.println(s.nextToken());
		count++;
	}
	System.out.println("Splitted String is="+count);
}
}
