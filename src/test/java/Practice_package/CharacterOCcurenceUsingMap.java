package Practice_package;

import java.util.HashMap;

public class CharacterOCcurenceUsingMap {

	public static void main(String[] args) {

		String s="sirisha";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=ch.length-1;i>=0;i--) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
			
		}
		System.out.println(map);
	}

}
