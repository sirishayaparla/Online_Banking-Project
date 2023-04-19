package JavaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPr {

	public static void main(String[] args) {

		ArrayList<Object> al=new ArrayList<Object>();
		
		al.add("siri");
		al.add(70);
		al.add(35.4);
		al.add('r');
		
		System.out.println(al);
		
		
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ai.add(50);
		ai.add(67);
		ai.add(0);
		ai.add(45);
		ai.add(98);
		ai.add(0);
		
		System.out.println("before sorting" + "  " +ai);
		Collections.sort(ai);
		System.out.println("After sorting" + "   " +ai);
		
		if(al.contains("hello")) {
			System.out.println("data is present");
		}
		else {
			System.out.println("data is not present");
		}
		
	
	
	}

}
