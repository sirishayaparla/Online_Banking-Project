package Practice_package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserEx {
	
	
	
	@Test
	public void TestScript1() {
		SoftAssert sa = new SoftAssert();
		System.out.println("=====testcase1=====");
		System.out.println("======testcase2=====");
		sa.assertEquals("actual name", "expectedname");
		System.out.println("==== script01 completed===");
		sa.assertAll();
		
	}
	
	
	@Test
	public void TestScript2() {
		int a=6;
		SoftAssert sa = new SoftAssert();

		System.out.println("=====testcase1=====");
		System.out.println("======testcase2=====");
		sa.assertNull(a);
		System.out.println(a);
		
		System.out.println("==== script01 completed===");

	}
	

}
