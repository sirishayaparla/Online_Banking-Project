package Practice_package;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new  HashMap<Integer , String> ();
		
		map.put(10, "siri");
		map.put(58, "45");
		map.put(47, "rupendra");
		map.put(1, "3.5");
		map.put(14, "siri");
		map.put(56, "c");
		map.put(75, "siri");
		map.put(58, "54");
		map.put(null,"hello");
		map.put(19, null);
		map.put(85, null);
		map.put(null, "hii");
		map.put(null, null);
		map.put(10, "kala");
		System.out.println(map);

		for( Entry<Integer, String> m:map.entrySet()) {
			System.out.println(m.getKey() + "  "+ m.getValue());
		}
		
		System.out.println(map.containsValue("siri"));//if more than value is there it return the true or else false
		System.out.println(map.containsKey(58));//if more than one key is there it returns the true or else false
		System.out.println(map.remove(56));

		
		
	}

}
