package JavaPractice;

public class ReverseString {

	public static void main(String[] args) {

		
		String s="software";
		char[] ch=s.toCharArray();
		String rev="";
		
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.print(rev);
		System.out.println(" ");

		//normal way
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println(" ");
		
		//using var count
		
		String s1="software";
		char[] ch1=s1.toCharArray();
		int count=0;
		for(char c:ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(ch1[i]);
		}
		
		System.out.println(" ");
		//using string builder class
		String name="siri";
		StringBuilder str=new StringBuilder(name);
		System.out.println(str.reverse());
	}

}
