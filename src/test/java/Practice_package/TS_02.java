package Practice_package;

import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class TS_02 extends BaseClass {
	
	
	@Test(groups="smoke")
	public void script3() {	
	System.out.println("======Script03=====");	
		}
	
	@Test(groups="smoke")
	public void script4() {
		System.out.println("=======Script04======");
	}


}
