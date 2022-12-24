package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
public WebDriver driver;


@Parameters(("browserName"))
@BeforeMethod
public void openapp(String browser) {
	if (browser.equals("chrome")) 
	   {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		driver=new ChromeDriver();
	    }
	else 
	    {
		driver=new FirefoxDriver();

	    }
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	
	
	@Test
	public void login() 
	{
	driver.findElement(By.id("email")).sendKeys("pavan");
	driver.findElement(By.id("pass")).sendKeys("12365498");
	driver.findElement(By.name("login")).click();
	String title = driver.getCurrentUrl();
	String url = driver.getTitle();
	
	Reporter.log(title,true);
	Reporter.log(url,true);
	}

	
	
}

