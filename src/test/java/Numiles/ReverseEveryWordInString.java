package Numiles;

public class ReverseEveryWordInString {

	public static void main(String[] args) {

		String s="my name is sirisha";
		String[] s1=s.split(" ");
		
		for(int i=0;i<=s1.length-1;i++) {
			String temp=s1[i];
			for(int j=temp.length()-1;j>=0;j--) {
				System.out.print(temp.charAt(j));
			}
			System.out.print(" ");
		}
	}

}
