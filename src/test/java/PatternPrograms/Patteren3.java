package PatternPrograms;

public class Patteren3 {

	public static void main(String[] args) {

		
		int n=5;
		
		for(int i=0;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		System.out.println("second way");
		
		//second method
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
