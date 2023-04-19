package JavaPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {

		
		LinkedHashSet<Object> set=new LinkedHashSet<Object>( );
		set.add(10);
		set.add("Rupendra");
		set.add("hi");
		set.add("Rupendra");
		set.add("hello");
		set.add(10);
		set.add(null);
		set.add(580);
		set.add(null);
		
		System.out.println(set);
		
		ArrayList <Object> al=new ArrayList<Object>();
		al.add(20);
		al.add("bye");
		System.out.println(al);
		
		System.out.println(set.size());
		System.out.println(al.size());

	
	}

}
