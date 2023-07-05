package Arrayprograms;

//addition of 2D array
public class AdditonOf2DArray {

	public static void main(String[] args) {

		int a[]= {5,8,1,0,3};
		int b[]= {5,7,1,2,8,0,7,0,9};
		
		int length=a.length;
		
		if(a.length<b.length) {
			length=b.length;
		}
		
		for(int i=0;i<length;i++) {
			try {
				System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e) {
				if(a.length<b.length) {
					System.out.print(b[i]+ " ");
				}
				else {
					System.out.println(a[i]+" ");
				}
			}
		}
	}

}
