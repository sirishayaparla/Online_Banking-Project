package Arrayprograms;

public class SumOfFirstThreeMinimumValuesWithBBsrot {

	public static void main(String[] args) {

		
		int a[]= {5,7,8,1,0,4};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 for(int i=0;i<3;i++) {
		sum=sum+a[i];	 
		 }
	//	sum=a[0]+a[1]+a[2];
		System.out.println(sum);
		}

}
