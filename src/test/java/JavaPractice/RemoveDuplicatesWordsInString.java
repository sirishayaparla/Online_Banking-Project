package JavaPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicatesWordsInString {

	public static void main(String[] args) {

		String st="i am i am a software engineer";
		String[] s = st.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		
		
		for(String str:set) {
			System.out.println(str + "  ");
		}
	
	}

}
