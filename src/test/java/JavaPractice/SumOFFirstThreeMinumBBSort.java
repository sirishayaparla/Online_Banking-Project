package JavaPractice;

public class SumOFFirstThreeMinumBBSort {

	public static void main(String[] args) {


		int [] a= {5,3,0,1,4};
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					 sum=sum+a[i];

				}
			}
		}

		System.out.println(sum);


	}

}
