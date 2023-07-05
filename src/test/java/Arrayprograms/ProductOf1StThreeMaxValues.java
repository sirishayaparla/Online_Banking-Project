package Arrayprograms;

//product of first three maximum values (descending order)
public class ProductOf1StThreeMaxValues {

	public static void main(String[] args) {

		int a[]= {4,8,7,3,4};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int prod=1;
		for(int i=0;i<3;i++) {
			prod=prod*a[i];
		}
		System.out.println(prod);
	}

}
