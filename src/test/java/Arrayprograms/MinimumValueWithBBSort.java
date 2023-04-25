package Arrayprograms;

public class MinimumValueWithBBSort {

	//find the minimum value using babule sort
	public static void main(String[] args) {
		
		
		int a[]= {6,2,1,3,0,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					 int temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
					
				}
				
			}
		}
		System.out.print(a[0]);


	}

}
