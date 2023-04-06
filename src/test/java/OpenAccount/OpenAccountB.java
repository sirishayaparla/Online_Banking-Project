package OpenAccount;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;
import com.PageObject.ApprovePendingAccountPage;
import com.PageObject.HomePage;
import com.PageObject.OpenAccountConformationPage;
import com.PageObject.OpenAccountpage;
import com.PageObject.StaffLoginHomePage;
import com.PageObject.StaffLoginPage;
import com.PageObject.ViewCustomerByAcPage;
@Listeners(com.GenericUtility.ListnerImplementionClass.class)
public class OpenAccountB extends BaseClass {
	@Test
	public void openac() throws Throwable {
	HomePage hp=new HomePage(driver);
	hp.openAccount();	
	OpenAccountpage op=new OpenAccountpage(driver);
	op.openaccount(driver);
	OpenAccountConformationPage oac = new OpenAccountConformationPage(driver);		
	String applicationnum = oac.applicationnum(driver);	
	
	//click on staff login
	
	StaffLoginPage sl = new StaffLoginPage(driver);
	sl.stafflogin();	
	Assert.fail();
	//Click on Approve Pending A/C module	
	StaffLoginHomePage slh = new StaffLoginHomePage(driver);
	slh.approvePendingAc();
	ApprovePendingAccountPage ap = new ApprovePendingAccountPage(driver);
	String accountnum = ap.approvependingaccount(applicationnum, driver);

	
	
	 //click on Home button present in staff login 
	slh.stafHome();
		
	//verify customer details after creating account			
		//click on customer by account module
		slh.viewCustomerbyAc();			
		ViewCustomerByAcPage vc = new ViewCustomerByAcPage(driver);	
		vc.VerifyCustomerbyAcNo(accountnum, driver);


	}	

}
