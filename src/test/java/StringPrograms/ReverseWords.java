package StringPrograms;

public class ReverseWords {

	public static void main(String[] args) {

		String s="my name is manasaa";
		String[] s1=s.split(" ");
		String rev=" ";
		for(int i=s1.length-1;i>=0;i--) {
			System.out.print(s1[i]+" ");
		
		}
	}

}
