package Practice_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OlympicsMedalCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().create();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		List<WebElement> teams = driver.findElements(By.xpath("//span[@data-cy='country-name']"));
		List<WebElement> gold = driver.findElements(By.xpath("//div[@title=\"Gold\"]"));
		
		List<WebElement> silver = driver.findElements(By.xpath("//div[@title=\"Silver\"]"));
		List<WebElement> bronze = driver.findElements(By.xpath("//div[@title=\"Bronze\"]"));
		
		for(int i=0;i<teams.size();i++) {
			System.out.println(teams.get(i).getText()+"    "+gold.get(i).getText()+"    "+silver.get(i).getText()+"    "+bronze.get(i).getText());
		}
		driver.close();
	}

}
