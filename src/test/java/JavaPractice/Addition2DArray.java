package JavaPractice;

public class Addition2DArray {

	public static void main(String[] args) {

		//o/p: 7 4 7 11 4
		
		int a[]= {4,3,2,5,7,8,9,1};
		int b[]= {3,1,5,6,8,9};
			
		int length = a.length;
			
		if(a.length<b.length) {
			length=b.length;
		}
		
		for (int i = 0; i < length; i++) {
			
			try {
				System.out.println(a[i]+b[i]+" ");
				
			}
			
			catch(Exception e) {
				
				if(a.length<b.length) {
				System.out.println(b[i]);
			}
			else {
				System.out.println(a[i]);
			}
			}
		}
			
		}
		
	}


