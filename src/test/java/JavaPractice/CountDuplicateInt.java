package JavaPractice;

import java.util.LinkedHashSet;

public class CountDuplicateInt {

	public static void main(String[] args) {

		
		int a[]= {4,5,4,1,5,3,2};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		
		for(int i=0;i<=a.length-1;i++) {
			set.add(a[i]);
			}

		for (Integer in : set) {
			int count=0;
			for(int i=0;i<=a.length-1;i++) {
				if(in==a[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(in+ " is repeating " +count+  "  times");
			}
			
		}
	}

}
