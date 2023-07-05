package Numiles;

import java.util.HashMap;

public class RemoveDuplicatesUsingMap {

	public static void main(String[] args) {

		String s="manasamanasaaReddy";
		char[] ch=s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0;i<=ch.length-1;i++) {
			if(map.containsKey(ch[i])==false) {
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
	}

}
