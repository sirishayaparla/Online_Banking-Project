package RS;

public class MockQuest {

	public static void main(String[] args) {

		
		String s="sis";
		char[] st = s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+st[i];
					
		}
		if(rev.equals(s)) {
			System.out.println("String is palyndrome");
		}
		else {
			System.out.println("String is not palyndrome");
		}
		
	}

}
