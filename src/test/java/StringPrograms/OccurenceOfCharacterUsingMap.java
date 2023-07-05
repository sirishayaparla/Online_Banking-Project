package StringPrograms;

import java.util.HashMap;

public class OccurenceOfCharacterUsingMap {

	public static void main(String[] args) {

		String s="sirisha";
		char[] ch=s.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<=ch.length-1;i++) {
			if(map.containsKey(ch[i])==false) {
				map.put(ch[i], 1);
			}
			else if(map.containsKey(ch[i])==true) {
				map.put(ch[i], map.get(ch[i])+1);
				
			}
		}
System.out.println(map);		
		
		}

}
