
public class Count_numbers_spl {
	public static void main(String[] args) {
		String s="SuFHD468&*%";
		int alphacount=0;
		int numberscount=0;
		int splcharcount=0;
		
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>='a')&&(s.charAt(i)<='z')||(s.charAt(i)>='A')&&(s.charAt(i)<='Z')) {
				alphacount++;
			}
			else if((s.charAt(i)>='0')&&(s.charAt(i)<='9')) {
				numberscount++;
			}
			else {
				splcharcount++;
			}
			
		}
		System.out.println(alphacount);
		System.out.println(numberscount);
		System.out.println(splcharcount);
	}

}
