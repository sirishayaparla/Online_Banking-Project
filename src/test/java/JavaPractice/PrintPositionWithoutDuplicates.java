package JavaPractice;

import java.util.LinkedHashSet;

public class PrintPositionWithoutDuplicates {

	public static void main(String[] args) {

		int a[]= {4,5,4,1,5,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<=a.length-1;i++) {
			set.add(a[i]);

			}
		
		for (Integer in: set) {
			for(int i=0;i<a.length-1;i++) {
			if(in==a[i]) {
			System.out.println(in+ " position is " +(i+1) );
			break;
			}
			}
		}
			
	}

}
