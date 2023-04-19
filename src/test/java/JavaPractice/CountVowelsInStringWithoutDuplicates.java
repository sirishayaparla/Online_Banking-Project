package JavaPractice;

import java.util.LinkedHashSet;

public class CountVowelsInStringWithoutDuplicates {

	public static void main(String[] args) {

		String st="Engineer";
				char[] ch = st.toCharArray();
				
				LinkedHashSet<Character> set = new LinkedHashSet<Character>();
				for(int i=0;i<=ch.length-1;i++)
					{
					if(ch[i] =='a' || ch[i] =='e'|| ch[i] =='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
					{
					set.add(ch[i]);
					}
			}
				for (Character c : set) {
					int count=0;
					for(int i=0;i<st.length()-1;i++) {
						if(c==ch[i]) {
							count++;
						}
					}
					if(count==1) {
						System.out.println(c);
					}
					
				}
}
}
