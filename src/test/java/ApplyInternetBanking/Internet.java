package ApplyInternetBanking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.GenericUtility.ExcelUtility;
import com.GenericUtility.FileUtility;
import com.GenericUtility.JavaUtility;
import com.GenericUtility.WebDriverUtility;
import com.PageObject.InternetBankingRegistrationPage;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Internet {

	public static void main(String[] args) throws Throwable {
		FileUtility fLib = new FileUtility();
		JavaUtility jLib = new JavaUtility();
		WebDriverUtility dLib = new WebDriverUtility();
		ExcelUtility eLib=new ExcelUtility();

		WebDriverManager.chromedriver().create();
		WebDriver driver=new ChromeDriver();
		dLib.maximizewindow(driver);
		String aurl = fLib.readDataFromPropertyFile("url");
		driver.get(aurl);
		dLib.waitForPageLoad(driver);	
		
		WebElement ele = driver.findElement(By.partialLinkText("Internet Banking"));
		dLib.scroolBarActions(driver, ele);
		Actions a=new Actions(driver);
		a.moveToElement(ele);
		driver.findElement(By.partialLinkText("Register")).click();

		System.out.println("hii siri");
	//	InternetBankingRegistrationPage ib=new InternetBankingRegistrationPage(driver);
		//ib.regristration(driver);
		
	}

}
