package JavaPractice;

public class ReverseWordsInString {

	
	
	public static void main(String[] args) {

		
		String sen="i am a software engineer";
		String[] st=sen.split(" ");
		String rsen="";
		
		
		for(int i=0;i<st.length;i++) {//it will word index based
			
			String str=st[i];
			for(int j=str.length()-1;j>=0;j--) {//it will reverse the word
				System.out.print(str.charAt(j));//after revesing it will print the word
			}
			System.out.print(" ");//after reverse the word it will add the speace
		}
		
		
	}
	

}
