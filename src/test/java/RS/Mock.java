package RS;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mock {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/");
		WebElement rank = driver.findElement(By.xpath("(//button[contains(. , 'Rankings')])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(rank);
		driver.findElement(By.xpath("(//div[1]/descendant::ul/li[2]/a)[1]")).click();
		driver.findElement(By.xpath(""));
		
	}

}
