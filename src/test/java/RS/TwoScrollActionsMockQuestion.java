package RS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TwoScrollActionsMockQuestion {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.phptravels.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Last modified ']"));
			int y = ele.getLocation().getY();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,"+y+")",ele);
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//div[text()='Configuration'])[2]")).click();
			driver.navigate().back();
		WebElement api = driver.findElement(By.xpath("(//div[text()='API Response Error'])[1]"));
		int y1 = api.getLocation().getY();
		System.out.println(y1);
		js.executeScript("window.scrollBy(0,3174)" , api);
		Thread.sleep(3000);
		api.click();
		driver.close();
				
	}

}
