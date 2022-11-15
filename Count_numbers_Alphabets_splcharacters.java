
public class Count_numbers_Alphabets_splcharacters {
	public static void main(String[] args) {
		String s="SubhasM123@#gmail.com";
		int lowercasecount=0;
		int uppercasecount=0;
		int numberscount=0;
		int Specialcharactercount=0;
		
		for (int i = 0; i < s.length(); i++) {
			if((s.charAt(i)>='a')&&(s.charAt(i)<='z')) {
				lowercasecount++;
				
			}
			else if((s.charAt(i)>='A')&&(s.charAt(i)<='Z')) {
				uppercasecount++;
				
			}
			else if((s.charAt(i)>='0')&&(s.charAt(i)<='9')) {
				numberscount++;
			}
			else {
				Specialcharactercount++;
			}
		}
		System.out.println(lowercasecount);
		System.out.println(uppercasecount);
		System.out.println(numberscount);
		System.out.println(Specialcharactercount);
	}

}
