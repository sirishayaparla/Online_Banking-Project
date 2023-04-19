package Practice_package;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockQuestion {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the country name");
		String countryname = sc.nextLine();
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> cn = driver.findElements(By.xpath("//span[@data-cy=\"country-name\"]"));
		List<WebElement> gold = driver.findElements(By.xpath("//div[@title=\"Gold\"]"));
		List<WebElement> silver = driver.findElements(By.xpath("//div[@title=\"Silver\"]"));
		List<WebElement> bronze = driver.findElements(By.xpath("//div[@title=\"Bronze\"]"));
		int count = cn.size();
		int scount = silver.size();

		for(int i=0;i<count;i++)
		{
			String name = cn.get(i).getText();
			
			if(name.contains(countryname))
				{
					String silvercount = silver.get(i).getText();
				String goldcount = gold.get(i).getText();
				String bronzecount = bronze.get(i).getText();
				
				System.out.println(name+ " silver Score is" +silvercount);
				System.out.println(name+ " gold Score is" +goldcount);
					System.out.println(name+ "bronze score is" +bronzecount);
					
					}
			}
		driver.close();
		}

	}


