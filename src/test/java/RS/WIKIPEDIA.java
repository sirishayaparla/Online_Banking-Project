package RS;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WIKIPEDIA {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_area");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> country = driver.findElements(By.xpath("(//tbody)[2]/tr/td[@style=\"text-align:left;\"]/child::a"));
		List<WebElement> landkm = driver.findElements(By.xpath("(//tbody)[2]/tr/descendant::td[2]/following-sibling::td[2]"));
		for(int i=0;i<country.size();i++) {
			int landkms=0;
			String s = landkm.get(i).getText();
			if(!(s.isBlank()|| s.isEmpty())){
				String[] text = s.split(" ");
				landkms=Integer.parseInt(text[0].replaceAll(",",""));
				//2,149,690 (830,000)	
			}
			if(landkms>=2149690 && landkms<=2973190) {
				System.out.println(country.get(i).getText()+" ======"+landkm.get(i).getText());
	
			}
		}
	}

}
