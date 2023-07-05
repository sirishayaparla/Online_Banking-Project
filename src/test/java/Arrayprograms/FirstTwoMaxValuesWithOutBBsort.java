package Arrayprograms;

public class FirstTwoMaxValuesWithOutBBsort {

	public static void main(String[] args) {


		int a[]= {5,7,0,2,4,1,3};
		int fmax=a[0];
		int smax=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]<fmax && a[i]>smax) {
				smax=a[i];			
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
