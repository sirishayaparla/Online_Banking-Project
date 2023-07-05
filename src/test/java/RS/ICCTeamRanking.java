package RS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ICCTeamRanking {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.icc-cricket.com/homepage");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement ele = driver.findElement(By.xpath("(//button[contains(.,'Rankings')])[1]"));
		 Actions a=new Actions(driver);
		 a.moveToElement(ele).perform();
		 driver.findElement(By.xpath("(//a[contains(text(),'Team Rankings')])[1]")).click();
		 List<WebElement> teams = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		List<WebElement> point = driver.findElements(By.xpath("class=\"rankings-block__banner--matches\""));
		 
		 List<WebElement> ratings = driver.findElements(By.xpath("//span[@class='u-hide-phablet']/parent::td/following-sibling::td[3]"));
		 for (int i = 0; i <10; i++) {
			System.out.println(teams.get(i).getText()+"----"+ratings.get(i).getText()+" ==="+point.get(i).getText());
		}
		 
	}

}
