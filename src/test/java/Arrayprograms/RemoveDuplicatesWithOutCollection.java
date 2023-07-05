package Arrayprograms;

import java.util.Arrays;

public class RemoveDuplicatesWithOutCollection {

	public static void main(String[] args) {
		
		//first we need insertion order

		int a[]= {2,5,7,4,2,4,7,1,5};
		//here k is we took index purpose
		int k=0;
		
		for(int i=0;i<=a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++) {
			//here after sorting to remove duplicates we have compare
			if(a[i]!=a[i+1]) {
				
				a[k]=a[i];
				k++;
			}
		}
		a[k]=a[a.length-1];
		for(int i=0;i<=k;i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}

}
