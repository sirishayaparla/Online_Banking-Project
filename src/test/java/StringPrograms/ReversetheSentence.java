package StringPrograms;

import java.util.Iterator;

public class ReversetheSentence {

	public static void main(String[] args) {


		String sen="kala is a beautifully women";
		String [] s=sen.split(" ");
		
		String rev="";
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+s[i]+" ";

		}
		System.out.print(rev);
System.out.println();	
		
		//word only reverse

		for(int i=0;i<s.length;i++) 
		{
			String str = s[i];
			for(int j=str.length()-1;j>=0;j--) 
			{
				System.out.print(str.charAt(j));
			}
			System.out.print(" ");
			

		}
	}

}
