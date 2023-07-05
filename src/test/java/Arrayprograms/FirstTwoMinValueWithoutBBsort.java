package Arrayprograms;

public class FirstTwoMinValueWithoutBBsort {

	public static void main(String[] args) {


			int a[]= {5,8,0,7,0,0,1,1,9,7,3};
			
			int fmin=a[0];
			int smin=a[0];
			
			for(int i=0;i<a.length;i++) {
				if(a[i]<fmin)
				{
					smin=fmin;
					fmin=a[i];
					
				}
				else if(a[i]<smin && a[i]>fmin) {
					smin=a[i];
				}
			}
			System.out.println("the first min " +fmin);
			System.out.println("the second min "+smin);
	}

}
