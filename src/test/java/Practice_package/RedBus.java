package Practice_package;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {
	
	
	@Test
	public void busTicket() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("bangalore");
		driver.findElement(By.xpath("//li[text()='Majestic, Bangalore']")).click();
		driver.findElement(By.id("dest")).sendKeys("Nellore");
		driver.findElement(By.xpath("//li[text()='Nellore']")).click();
		driver.findElement(By.id("onward_cal")).click();
		driver.findElement(By.xpath("//tbody//tr[5]/td[6]")).click();
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(3000);
		
		List<WebElement> buses = driver.findElements(By.xpath("//div[@class=\"travels lh-24 f-bold d-color\"]"));
		List<WebElement> pr = driver.findElements(By.xpath("//div[@class=\"fare d-block\"]"));	
		int count=buses.size();
		System.out.println(count);
//		
//		for( ; ; ) {
//			
//			try {
//				
//			}
//			
//			
//		}
		
		for(int i=0;i<count;i++) {
			System.out.println(buses.get(i).getText()+"       "+pr.get(i).getText());
		}
		
	}

}
