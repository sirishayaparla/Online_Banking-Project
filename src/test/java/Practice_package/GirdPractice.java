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

public class GirdPractice {
	
	WebDriver driver=null;
	@Test
	public void girdp() throws MalformedURLException, InterruptedException {
		
		//URL url=new URL("http://192.168.225.111:1234/wd/hub");
		URL url=new URL("http://192.168.0.181:1122/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(url, cap);
		//driver.get("https://developer.microsoft.com/en-us/microsoft-edge/tools/webdriver/#installation");
		driver.get("http://rmgtestingserver/domain/");
		Thread.sleep(2000);
		driver.close();
		
	}
}
