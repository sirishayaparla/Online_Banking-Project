package StringPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RevmoveDuplicateInString {
	
	


	public static void main(String[] args) {
		String s="sirishareddy";
		char[] ch=s.toCharArray();
		HashSet<Character> set=new HashSet<Character>();
		LinkedHashSet<Character> lset=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++) {
			
			set.add(s.charAt(i));
			lset.add(s.charAt(i));
			
		}
			
		System.out.println(set);
		System.out.println(lset);
		
	}

}
