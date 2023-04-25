package RS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ex {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.phptravels.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement eleap = driver.findElement(By.xpath("(//div[text()='API Response Error'])[1]"));	
		eleap.click();
		driver.navigate().back();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		int y1 = eleap.getLocation().getY();
		Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,"+y1+")",eleap);
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		 Thread.sleep(3000);
		 
	//	 driver.close();


	}

}
