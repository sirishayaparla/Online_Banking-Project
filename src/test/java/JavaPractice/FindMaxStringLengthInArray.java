package JavaPractice;

public class FindMaxStringLengthInArray {

	public static void main(String[] args) {

		String	s1[]= {"abc","abcdd","dv","abcd","ab","adbce"};//o/p: ab
		
		String minlen1=s1[0];
		
		for(int i=0;i<=s1.length-1;i++) {
			if(minlen1.length()<s1[i].length()) {
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
