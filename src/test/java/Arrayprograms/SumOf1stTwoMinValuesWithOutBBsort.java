package Arrayprograms;

public class SumOf1stTwoMinValuesWithOutBBsort {

	public static void main(String[] args) {

		
		int a[]= {1,8,2,0,4,1,4};
		int fmin=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;
	
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
				
			}
			else if(a[i]<smin && a[i]>fmin ) {
				smin=a[i];
				
			}
			
		}
		System.out.println(fmin);
		System.out.println(smin);
	
		int sum=fmin+smin;
		System.out.println("sum is " +sum);
	}

}
