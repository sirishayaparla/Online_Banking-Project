package JavaPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicateInt {

	public static void main(String[] args) {

		
		int a[]= {4,5,4,1,5,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<=a.length-1;i++) {
			set.add(a[i]);
			}
		
		for (Integer in : set) {
			
			System.out.println(in);
			
		}
		
	}

}
