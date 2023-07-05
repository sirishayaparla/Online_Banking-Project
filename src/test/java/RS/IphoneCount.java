package RS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IphoneCount {

	private static final String Duration = null;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		 WebElement text = driver.findElement(By.xpath("//span[@class=\"_10Ermr\"]"));
		 System.out.println(text);

		 List<WebElement> page = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		 int page1c = page.size();
			System.out.println(page.size());
			
		//scrolling 
		WebElement ele = driver.findElement(By.xpath("//span[text()='Page 1 of 3']"));
		 int y = ele.getLocation().getY();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+")",ele);
		
		//click next

	WebElement element = driver.findElement(By.xpath("//nav[@class=\"yFHi8N\"]/child::a[2]"));

	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	
	
	//page 2
	 List<WebElement> page2 = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
	 int page2c = page2.size();
		System.out.println(page2c);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,"+y+")",ele);
		
//click next		
		WebElement element3 = driver.findElement(By.xpath("//nav[@class=\"yFHi8N\"]/child::a[3]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element3);
		
		
		 List<WebElement> page3 = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		 int page3c = page3.size();
			System.out.println(page3c);
		
			int expcount=56;
			int actcount=page1c+page2c+page3c;
			System.out.println(actcount);
			Assert.assertEquals(expcount, actcount);

	

	}

}
