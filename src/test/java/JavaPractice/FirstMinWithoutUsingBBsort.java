package JavaPractice;

public class FirstMinWithoutUsingBBsort {

	public static void main(String[] args) {

		
		int [] a= {5,3,0,1,4};
		int min=a[0];
		int smin;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(min>a[i]) {

					min=a[i];
				}
			}
		}

		System.out.println(min);

	}

}
