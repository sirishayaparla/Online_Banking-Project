package JavaPractice;

import java.util.LinkedHashSet;

public class PositionOFEachCharInStringWithOutDup {

	public static void main(String[] args) {

		String st="kannada";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++) {
			set.add(st.charAt(i));
		}
		
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<st.length();i++) {
				if(ch==st.charAt(i)) {
					System.out.println(ch+ " is present " +(i+1)+" position");
					break;
				}
				
			}
		}
	}

}
