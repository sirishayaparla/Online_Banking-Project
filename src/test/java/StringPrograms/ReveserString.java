package StringPrograms;

public class ReveserString {

	public static void main(String[] args) {


		
		String s="sirisha";
		char [] ch=s.toCharArray();
		String rev="";
		
		System.out.println(ch);
		for(int i=s.length()-1;i>=0;i--) {

			rev=rev+ch[i];
		}
		System.out.println(rev);
	}

}
