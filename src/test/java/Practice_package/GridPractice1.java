package Practice_package;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GridPractice1 {
	
	
	@Test
	public void sg() throws MalformedURLException, InterruptedException {
		
		
		String exemode="remote";
		WebDriver driver=null;
		if(exemode.equalsIgnoreCase("remote")){
			
			//URL url=new URL("http://192.168.43.5:1111/wd/hub");
			URL url=new URL("http://192.168.0.181:1122/wd/hub");

			DesiredCapabilities cap=new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(url,cap);
						
		}
		else if(exemode.equals("local")){
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver/domain/");
		Thread.sleep(2000);
		driver.close();
	}

}
