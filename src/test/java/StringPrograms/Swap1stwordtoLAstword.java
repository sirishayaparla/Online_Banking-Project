package StringPrograms;

public class Swap1stwordtoLAstword {

	public static void main(String[] args) {


			String sen="i am sister of chitra";
			String [] s=sen.split(" ");
			
			String temp = s[0];
			 s[0]=s[s.length-1];
			 s[s.length-1]=temp;
			 
			 for(int i=0;i<=s.length-1;i++) {
				 System.out.print(s[i]+ " ");
			 }
			
	}

}
