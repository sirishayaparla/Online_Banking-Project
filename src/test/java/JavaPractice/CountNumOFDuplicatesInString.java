package JavaPractice;

import java.util.LinkedHashSet;

public class CountNumOFDuplicatesInString {

	public static void main(String[] args) {


		String st="kannada";
		LinkedHashSet<Character> set =new LinkedHashSet<Character>();
		for(int i=0;i<st.length();i++) {
			set.add(st.charAt(i));
		}
		System.out.println(set);
		
		for(Character ch:set) {
			int count=0;
			for(int i=0;i<st.length();i++) {
				if(ch==st.charAt(i)) {
					count++;
		
					}
			}
			if(count>1) {
				System.out.println(ch+ " is repeating " +count+" times");
			}
		}
	}

}
