package Practice_package;

import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;

public class TS_03 extends BaseClass {

	
	@Test(groups = "smoke")
	public void script5() {	
	System.out.println("======Script05=====");	
		}
	
	@Test(groups="regression")
	public void script6() {
		System.out.println("=======Script06======");
	}

}
