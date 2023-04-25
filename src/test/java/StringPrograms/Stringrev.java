package StringPrograms;

public class Stringrev {

	public static void main(String[] args) {

		
		String s="sirisha";
		char[] st = s.toCharArray();
		
			String rev="";
			
			for(int i=s.length()-1;i>=0;i--) {
				rev=rev+st[i];
			}
			System.out.print(rev);
			
	}

}
