package navigation.Api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLibraries {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com");
	
	
	Thread.sleep(2000);
	//back
	driver.navigate().back();
	
	Thread.sleep(2000);
	//forward
	driver.navigate().forward();
	
	Thread.sleep(2000);
	//refresh
	driver.navigate().refresh();
	
	

		
	}

}

