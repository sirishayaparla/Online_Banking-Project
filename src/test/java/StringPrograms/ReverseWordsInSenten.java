package StringPrograms;

public class ReverseWordsInSenten {

	public static void main(String[] args) {

		String sen="i am engineer";
		String[] s = sen.split(" ");
		String rev=" ";
		
		for(int i=s.length-1;i>=0;i--) {
			rev=rev+s[i]+" ";
		}
		System.out.println(rev);
	}

}
