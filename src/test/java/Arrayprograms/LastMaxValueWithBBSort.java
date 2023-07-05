package Arrayprograms;


//find the last maximum value  (desending order last value)
public class LastMaxValueWithBBSort {

	public static void main(String[] args) {


		
		int a[]= {2,8,0,4,7,0,6};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
	
		}
		System.out.println(a[a.length-1]);
	}

}
