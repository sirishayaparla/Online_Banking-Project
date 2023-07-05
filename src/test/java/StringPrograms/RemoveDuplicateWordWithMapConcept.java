package StringPrograms;

import java.util.HashMap;

public class RemoveDuplicateWordWithMapConcept {

	public static void main(String[] args) {

		String s="siri siri sirisha Redy";
		String[] s1=s.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<=s1.length-1;i++) {
			int count=0;
			if(map.containsKey(s1[i])) {
				map.put(s1[i], map.get(s1[i])+1);
			}
			 else  {
				map.put(s1[i], 1);
			}


		}

		System.out.println(map);
		
		}

}
