package StringPrograms;

import java.util.HashMap;

public class HashMapConceptsRemove {

	public static void main(String[] args) {

			String s="sucessful";
			char[] ch=s.toCharArray();
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=ch.length-1;i>=0;i--) {
				if(map.containsKey(ch[i])==false) {
					map.put(ch[i], 1);
				}
				else {
					Integer oddvalue=map.get(ch[i]);
					Integer newvalue=oddvalue+1;
					
					map.put(ch[i], newvalue);
				}
			}
			System.out.print(map);
	}

}
