package Arrayprograms;

public class DessendingArrayWithBBSort {

	
	//sorting in desending order using babule sort
	public static void main(String[] args) {

		
		int a[]= {7,1,0,4,6,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]);
		}
		
	}

}
