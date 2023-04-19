package JavaPractice;

public class PalyndromeString {

	public static void main(String[] args) {


		
		String s="gadag";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		
		if(rev.equals(s)) {
			System.out.println("It is a palyndrome string");
		}
		else {
			System.out.println("it is not palyndrome String");
		}
	}

}
