package ApplyDebitcard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GenericUtility.BaseClass;
import com.PageObject.ApplyDebitCardPage;
import com.PageObject.ApprovePendingAccountPage;
import com.PageObject.HomePage;
import com.PageObject.OpenAccountConformationPage;
import com.PageObject.OpenAccountpage;
import com.PageObject.StaffLoginHomePage;
import com.PageObject.StaffLoginPage;
import com.PageObject.ViewCustomerByAcPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ApplyDebitCardB extends BaseClass{
	
	@Test
	public void applydebit() throws Throwable {
		
		HomePage hp=new HomePage(driver);
		hp.openAccount();	
		OpenAccountpage op=new OpenAccountpage(driver);
		op.openaccount(driver);
		OpenAccountConformationPage oac = new OpenAccountConformationPage(driver);		
		String applicationnum = oac.applicationnum(driver);			
		StaffLoginPage sl = new StaffLoginPage(driver);
		sl.stafflogin();		
		StaffLoginHomePage slh = new StaffLoginHomePage(driver);
		slh.approvePendingAc();
		ApprovePendingAccountPage ap = new ApprovePendingAccountPage(driver);
		String accountnum = ap.approvependingaccount(applicationnum, driver);
 
		slh.stafHome();
			
		//verify customer details after creating account			
			//click on customer by account module
			slh.viewCustomerbyAc();			
			ViewCustomerByAcPage vc = new ViewCustomerByAcPage(driver);	
			 String dname = vc.VerifyCustomerbyAcNo(accountnum, driver);
				 		
				//click on logout button present in staff page 
				slh.staffLogBtn();
				//click on home button
				hp.homeBtn();
				//click on Apply debit card module
				 hp.applyDebitCard();
				ApplyDebitCardPage adc = new ApplyDebitCardPage(driver);
				String[] dp = adc.applyDebit(dname, accountnum, driver);
					hp.getHome().click();
					driver.close();

	}

}
