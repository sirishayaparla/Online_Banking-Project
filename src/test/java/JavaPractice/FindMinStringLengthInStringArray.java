package JavaPractice;

public class FindMinStringLengthInStringArray {

	public static void main(String[] args) {

	/*String	s[]= {"abc","abcdd","abcd","ab"};//o/p: ab
	
	String minlen=s[0];
	
	for(int i=0;i<=s.length-1;i++) {
		if(minlen.length()>s[i].length()) {
			minlen=s[i];
		}
	}
	System.out.println(minlen);*/
	
	
	//if we two minimum values is there 
	
	String	s1[]= {"abc","abcdd","dv","abcd","ab"};//o/p: ab
	
	String minlen1=s1[0];
	
	for(int i=0;i<=s1.length-1;i++) {
		if(minlen1.length()>s1[i].length()) {
			minlen1=s1[i];
		}
	}
		for(int i1=0;i1<s1.length;i1++) {
			if(minlen1.length()==s1[i1].length()) {
				
				System.out.println(s1[i1]+" ");	

			}
		}
				
	}

}
