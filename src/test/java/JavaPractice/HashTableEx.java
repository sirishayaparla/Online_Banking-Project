package JavaPractice;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {

	Hashtable<Integer, String> map = new  Hashtable<Integer , String> ();
	
	map.put(10, "siri");
	map.put(58, "45");
	map.put(47, "rupendra");
	map.put(1, "3.5");
	map.put(14, "siri");
	map.put(56, "c");
	map.put(75, "siri");
	map.put(58, "54");
	System.out.println(map);

	for( Entry<Integer, String> m:map.entrySet()) {
		System.out.println(m.getKey() + "  "+ m.getValue());
	}
	
	System.out.println(map.containsValue("siri"));//if more than value is there it return the true or else false
	System.out.println(map.containsKey(58));//if more than one key is there it returns the true or else false
	System.out.println(map.remove(56));

	System.out.println("After removing key"+map);
	
		
		
		
	}

}
