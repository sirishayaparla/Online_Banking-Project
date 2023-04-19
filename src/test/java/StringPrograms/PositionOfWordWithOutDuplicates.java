package StringPrograms;

import java.util.LinkedHashSet;

public class PositionOfWordWithOutDuplicates {

	public static void main(String[] args) {

		String sen="i am i am a software engineer";
		String[] s = sen.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for(int i=0;i<=s.length-1;i++) {
			set.add(s[i]);
		}

			for (String st : set) {
				
				for(int i=0;i<=s.length-1;i++) {
					
				}
			}
	}

}
