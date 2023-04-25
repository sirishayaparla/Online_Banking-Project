
public class SumOfDiditsInTheGivenString {

	public static void main(String[] args)
	   {  
        String s="x1y2z3";
    	int sum=0;
        for(int i=0;i<s.length();i++)
        {
        
        	if(s.charAt(i)>='0' && s.charAt(i)<='9')
        	{
        		sum=sum+s.charAt(i)-48;
        	}
     
}
        System.out.println(sum);
}
}


