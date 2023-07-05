package Numiles;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceDuplicatesUSingMap {

	public static void main(String[] args) {

		String s="manasa";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<=ch.length-1;i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		for (Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue()==1)
				System.out.println(c.getKey());
		}
	}

}
