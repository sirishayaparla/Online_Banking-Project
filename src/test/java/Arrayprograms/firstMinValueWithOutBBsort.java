package Arrayprograms;

public class firstMinValueWithOutBBsort {

	public static void main(String[] args) {


		int a[]= {3,6,4,1,2,0};
		int min=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
