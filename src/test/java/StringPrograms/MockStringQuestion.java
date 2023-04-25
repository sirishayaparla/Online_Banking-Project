package StringPrograms;

public class MockStringQuestion {

	public static void main(String[] args) {

		
		String s="sirisha";
			char[] ch = s.toCharArray();
			
			for(int i=0;i<ch.length;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				System.out.println(ch[i]);
			}
		}

}
