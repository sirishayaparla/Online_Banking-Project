package JavaPractice;

public class FirstTwoMaxValuesWithoutBBSort {

	public static void main(String[] args) {

		int [] a= {5,3,0,1,4};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]<fmax) {

					smax=fmax;
					fmax=a[i];
				}
				else if(a[i]<smax) {
					smax=a[i];
				}
			}
		System.out.println(a[a.length-1]);
		System.out.println(a[a.length-2]);

//		System.out.println(fmax);
//		System.out.println(smax);

		
	}

}
