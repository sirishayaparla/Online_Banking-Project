package Arrayprograms;

public class ProductOf1stThreeMaxVlauesWithBBsort {

	public static void main(String[] args) {


		int a[]= {5,9,7,2,3,4};
		
		int prod=1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		prod=a[0]*a[1]*a[2];

		System.out.println(prod);
	
	}

}
