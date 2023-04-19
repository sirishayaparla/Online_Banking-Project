package PatternPrograms;

public class AlphaPattern {

	public static void main(String[] args) {
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 
//		A B C D E 

		int n=5;
		
		for(int i=1;i<=n;i++) {
			char ch='A';
			for(int j=1;j<=n;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}

}
