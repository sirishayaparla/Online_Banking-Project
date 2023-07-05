package Arrayprograms;

public class TWoDigitsSumEqualTo11 {

	public static void main(String[] args) {

		int a[]= {5,6,1,0,5,2,7,4,8,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]+a[j]==11) {
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

}
