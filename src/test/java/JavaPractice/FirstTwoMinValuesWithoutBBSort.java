package JavaPractice;

public class FirstTwoMinValuesWithoutBBSort {

	public static void main(String[] args) {
		int [] a= {5,3,0,1,4};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]<fmin) {

					smin=fmin;
					fmin=a[i];
				}
				else if(a[i]<smin) {
					smin=a[i];
				}
			}
		

		System.out.println(fmin);
		System.out.println(smin);
	}

}
