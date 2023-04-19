package JavaPractice;

public class Swap1stWordToLastWord {

	public static void main(String[] args) {

		
		String sen="i am a software engineer";
		String[] st=sen.split(" ");
		
		 String temp = st[0];
		 st[0]=st[st.length-1];
		 st[st.length-1]=temp;
		 
		 for(int i=0;i<=st.length-1;i++) {
			 System.out.println(st[i]+" ");
		 }
		
	}

}
