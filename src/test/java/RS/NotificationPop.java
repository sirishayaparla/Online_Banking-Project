package RS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.GenericUtility.WebDriverUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NotificationPop {

	public static void main(String[] args) throws AWTException {

//		ChromeOptions options=new  ChromeOptions();
//		options.addArguments("----disable-notification");
// before performing any actions on element chromeoption will work after clicking this option it will not work we have to use robot class or javascriptexcutor interface.
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mictests.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("mic-launcher")).click();
		WebDriverUtility wb=new WebDriverUtility();
		wb.robott(driver);
		driver.findElement(By.xpath("//a[text()='Test Webcam']")).click();
				wb.switchWindow(driver);
	//	wb.switchPerticularWindow(driver, "webcamtests");
		driver.findElement(By.xpath("//button[text()='Test my cam']")).click();
		wb.robott(driver);
		//Object n = ((JavascriptExecutor)driver).executeScript("return window.Notification");
		


	}

}
