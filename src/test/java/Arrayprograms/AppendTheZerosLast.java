


package Arrayprograms;

public class AppendTheZerosLast {

	public static void main(String[] args) {

		//input
		int a[]= {5,8,7,0,1,4,0,0,4};
		//o/u is {5,8,7,1,4,4,0,0,0}
				
		int b[]=new int[a.length];
		int m=0;
		int n=a.length-1;//length of array
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				b[m]=a[i];
				m++;
			}
			else {
				b[n]=a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}		
	}

}
