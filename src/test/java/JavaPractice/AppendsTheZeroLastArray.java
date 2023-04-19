package JavaPractice;

public class AppendsTheZeroLastArray {

	public static void main(String[] args) {

		//o/p={5,6,9,3,0,0,0}
		int [] a= {5,6,0,9,0,3,0};
		int []b=new int[a.length];
		int m=0;
		int n=a.length-1;
		
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
			System.out.println(b[i]);

		}
	}

}
