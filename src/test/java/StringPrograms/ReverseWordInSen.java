package StringPrograms;

public class ReverseWordInSen {
	public static void main(String[] args) {
		String sen="i am indian";
		String [] s=sen.split(" ");
		
		for(int i=0;i<s.length;i++) {
			String str=s[i];
			for(int j=str.length()-1;j>=0;j--){
				System.out.print(str.charAt(j));
			}
   System.out.print(" ");
		}

	}

}
