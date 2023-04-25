package StringPrograms;

public class SwapwordsFirsttoLast {

	public static void main(String[] args) {

		String s=" i am a student";
		String st[]=s.split(" ");
		String temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;

		for(int i=0;i<=st.length-1;i++) {
			System.out.print(st[i]+" ");
		}
		
	}

}
