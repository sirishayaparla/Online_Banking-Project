package JavaPractice;

public class AdditionOFDigitsInString {

	public static void main(String[] args) {

		String st="b2c1d5";
		int sum = 0;
		
		char[] ch = st.toCharArray();
		
			for(int i=0;i<ch.length;i++) {
				if(ch[i]>='0'&&ch[i]<='9') {
				int n = ch[i]-48;
					sum=sum+n;
				}
			}
			System.out.println(sum);
	}

}
