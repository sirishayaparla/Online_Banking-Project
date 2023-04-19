package RS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {
	
//get bus name & prices
	
	
	@Test
	public void trip(){
		
		WebDriverUtility wu=new WebDriverUtility();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		wu.maximizewindow(driver);
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class=\"chNavIcon appendBottom2 chSprite chBuses\"]")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		List<WebElement> buslist = driver.findElements(By.xpath("//span[@class=\"latoBlack font22 blackText appendRight15\"]"));
		List<WebElement> price = driver.findElements(By.id("price"));
		
		for(int i=0;i<buslist.size();i++) {
			String bus = buslist.get(i).getText();
			String pr = price.get(i).getText();
			System.out.println(bus+ "=======>"+pr);
		}
		
	}
}
