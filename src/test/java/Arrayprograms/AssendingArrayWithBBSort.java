package Arrayprograms;

public class AssendingArrayWithBBSort {

	//sorting in assending order using babule sort
	public static void main(String[] args) {

		
		int a[]= {1,5,0,2,7};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]);

		}
	}

}
