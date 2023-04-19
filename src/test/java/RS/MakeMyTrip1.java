package RS;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip1 {
	
	
	
	public static void main(String arg[]) throws InterruptedException {
		
		WebDriverUtility wu=new WebDriverUtility();
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		wu.maximizewindow(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']")).sendKeys("bangalore");
		driver.findElement(By.xpath("//span[.='Bangalore, Karnataka']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Nellore");
		driver.findElement(By.xpath("//span[.='Nellore, Andhra Pradesh']")).click();
		
		//Tue Apr 18 17:58:43 IST 2023
		Date dt=new Date();
		String[] sdt = dt.toString().split(" ");
		String day = sdt[0];
		String month = sdt[1];
		String date = sdt[2];
		String year = sdt[5];
		
//		Fri Apr 21 2023
		String today = day+" "+month+" "+date+" "+year;
		
		driver.findElement(By.xpath("//div[@aria-label='"+today+"']")).click();
		driver.findElement(By.xpath("//button[@data-cy='submit']")).click();
		
		
		
		driver.close();
	}

}
