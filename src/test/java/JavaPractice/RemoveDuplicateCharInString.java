package JavaPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {


		String st="kanada";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();//it will remove duplicates and maintained insertion oreder
		for(int i=0;i<=st.length()-1;i++) {
			set.add(st.charAt(i));//it will add the character to set
		}
		
		//after removing duplicates we will print here
		for(Character ch:set) {
			System.out.println(ch+" ");
		}
	}

}
