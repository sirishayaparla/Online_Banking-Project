package JavaPractice;

import java.util.LinkedHashSet;

public class LastPositionOFEachCharInStringWithoutDup {

	public static void main(String[] args) {

		String st="kannada";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++) {
			set.add(st.charAt(i));
		}
		
		for(Character ch:set) {
			int count=0;
			for(int i=st.length()-1;i>=0;i--) {
				if(ch==st.charAt(i)) {
					System.out.println(ch+ " is present " +(i+1)+" position");
					break;
				}
				
			}
		}

	}

}
