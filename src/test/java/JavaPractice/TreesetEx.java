package JavaPractice;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetEx {

	public static void main(String[] args) {

		TreeSet<Integer> set=new TreeSet<Integer>( );
		set.add(750);
		set.add(2);
		set.add(10);
		set.add(10);
		set.add(580);
		set.add(25);
		
		//it wii not allow duplicates
		
		System.out.println(set);
		
		System.out.println(set.pollFirst());//it will featch element which is first in poll and remove
		
		System.out.println(set.descendingSet());
		System.out.println(set.higher(9));//it wii give next highest number
		
		/*//it doesn't allow Null values we will NullpointerException
		set.add(null);
		System.out.println(set);*/
		
		/*//it will not allow hetrogenous type, we will get ClasscastException
		TreeSet<Object> set1=new TreeSet<Object>( );		
			set1.add("siri");
			set1.add(10);
			set.add(45);
			set1.add('c');
			System.out.println(set1);*/

		
		
	}

}
