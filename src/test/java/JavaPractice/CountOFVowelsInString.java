package JavaPractice;

public class CountOFVowelsInString {

	public static void main(String[] args) {


		String st="Engineer";
				char[] ch = st.toCharArray();
				int vcount=0;
				for(int i=0;i<=st.length()-1;i++) {
				if(ch[i] =='a' || ch[i] =='e'|| ch[i] =='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U') {
					{vcount++;
					System.out.print(ch[i]);
				}
					}
				
				}
				System.out.println("===> "+ "vowel count is "+vcount);
	}

}
