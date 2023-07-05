package Arrayprograms;

import java.util.HashMap;

public class SumTwoNumbersIs15 {
	
	//remove duplicates 

	public static void main(String[] args) {

		int a[]= {15,7,5,8,10,5};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==15) {
					if(map.containsKey(a[i])==false) {
						if(map.containsValue(a[i])==false) {
							map.put(a[i], a[j]);
						}
					}
				}
			}
		}
		
		System.out.println(map);
	}

}
