package Practice_package;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.com/");
		//it will take all links
		List<WebElement> listOfAllLinks = driver.findElements(By.xpath("//a"));
	//	System.out.println(listOfAllLinks.size());
		
		//which link having href attribute
		List<String> listOfLinks=new ArrayList<String> ();

		//we are adding broken links
		List<String> brokenLinks=new ArrayList<String> ();
		
		
		for(WebElement webelement: listOfAllLinks) {
			String link = webelement.getAttribute("href");
			
			if(link!=null) {
				if(link.contains("http"))
				{
					listOfLinks.add(link);
				}
				else {
					brokenLinks.add(link +"not having http protocal");
					}
				}
			else {
				brokenLinks.add(link +"====Null");
			}
		}
		
		for(String link:listOfLinks) {
			try {
				
				URL url=new URL(link);
				
				URLConnection urlCon = url.openConnection();
				 HttpURLConnection httpUrlcon = (HttpURLConnection)urlCon;
				 
				int statusCode = httpUrlcon.getResponseCode();
				String responseMsg = httpUrlcon.getResponseMessage();
				if(statusCode>=400) {
					brokenLinks.add(link+"====> Status code :" +statusCode+"====>Response msg:" +responseMsg);
				}
			}
			catch(Exception e) {
				
				brokenLinks.add(link+"======>Not connected to server");
			}
		}
		
		System.out.println(brokenLinks);
		System.out.println(brokenLinks.size());
		System.out.println(listOfLinks.size());
		driver.close();
	}

}
