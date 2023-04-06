package Practice_package;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;


@Listeners(com.GenericUtility.ListnerImplementionClass.class)
public class TS_01 extends BaseClass{

	
	
	@Test(retryAnalyzer = com.GenericUtility.RetryImplementionClass.class)
	public void script1() {	

	System.out.println("======Script01=====");	
	}
	
//	@Test(groups="regression")
//	public void script2() {
//		System.out.println("=======Script02======");
//	}
	
	 
}