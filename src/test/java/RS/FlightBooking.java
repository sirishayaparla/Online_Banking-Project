package RS;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlightBooking {
	
	public static void main (String arg[] ) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("mumbai");
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		for(;;)
		{
			String expText = driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]/div")).getText();
			if(expText.contains("July"))
			{
				driver.findElement(By.xpath("(//div[@class='DayPicker-Day']/div/p[text()='27'])[1]")).click();
				break;
			}
			else {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		
		
	//	driver.findElement(By.xpath("(//div[@class='DayPicker-Month'])[1]/div/div[text()='May 2023']/../../div[3]/div[4]/div[4]"));
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		driver.findElement(By.xpath("(//span[text()='View Prices'])[1]")).click();
	
		driver.findElement(By.xpath("(//button[text()='Book Now'])[1]")).click();
		
		//driver.switchTo().window("https://www.makemytrip.com/flight/reviewDetails");
		
		
	Set<String> ws = driver.getWindowHandles();
	String window = "https://www.makemytrip.com/flight/reviewDetails/?itineraryId";
	for( String w : ws) {
		if(w.contains(window)) {
		driver.switchTo().window(w);
		break;
		}
	}
	
	for(;;) {
		
		try {
			 driver.findElement(By.xpath("//button[@class='addTravellerBtn']"));
			 break;

		}
		catch(Exception e){
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("window.scrollBy(0,500)");

		}
	}
		
		

	
		 
		System.out.println("hiii	"); 
		 
		 

//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement ve = wait.until(ExpectedConditions.visibilityOf(ele));
		
		//WebElement ele = driver.findElement(By.xpath("//h2[text()='Traveller Details']"));
		

		 
		//driver.findElement(By.xpath("(//label[@class=\"radioboxContainer \"])[1]/span/input[@type='radio']")).click();
		
		
		
	}

}
