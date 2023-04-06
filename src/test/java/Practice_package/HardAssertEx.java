package Practice_package;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {
	
	@Test
	public void test1() {
		System.out.println("==== script01 completed===");
		System.out.println("=====testcase1=====");
		Assert.fail();
		System.out.println("======testcase2=====");
	//after failed it will excuted remaining lines it will skips remaining code lines
	}
	
	
	@Test
	public void test2() {
		System.out.println("==== script02 completed===");
		System.out.println("=====testcase3=====");
		System.out.println("======testcase4=====");
		Assert.assertEquals("siri", "reddy");
		System.out.println("======testcase5=====");
		System.out.println("======testcase6=====");

	
	}
	
	


}
