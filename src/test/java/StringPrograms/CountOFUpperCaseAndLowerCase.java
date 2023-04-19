package StringPrograms;

public class CountOFUpperCaseAndLowerCase {

	public static void main(String[] args) {

		String s="RupendraREddy";
		char[] ch=s.toCharArray();
		
		int lowercount=0;
		int uppercount=0;
		int spedigit=0;
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				lowercount++;
			}
			else if(ch[i]>='A' && ch[i]<='Z') {
				uppercount++;
			}
			else {
				spedigit++;
			}
		}
		System.out.println("lower count is"+lowercount);
		System.out.println("upper count is" +uppercount);
	}

}
