package Arrayprograms;

public class FirstSecondMaximumvalueWithBBsort {

	public static void main(String[] args) {

		
		int a[]= {5,7,8,9,0,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("first maximum value is  " +a[0]);
		System.out.println("second maximum value is  " +a[1]);
	}

}
