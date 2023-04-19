
package AssignmentPrograms;

import java.util.LinkedHashSet;

public class String1 {

	public static void main(String[] args) {

		String s="aaabbcdddf";
		//o/p:a3b2cd3f
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<=ch.length-1;i++) {
			set.add(ch[i]);
		}
		for (Character c : set) {
			int count=0;

			for(int i=0;i<=ch.length-1;i++) {
				if(c==ch[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.print(c+""+count);
			}
			else {
				System.out.print(c);
			}
		
			
			
		}
	}

}
