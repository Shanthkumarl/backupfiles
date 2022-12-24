package verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_login_page
{
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement button = driver.findElement(By.name("login"));
	if (button.isEnabled()) 
	{
		System.out.println("pass: is enabled");
	} else 
	{
		System.out.println("pass: is not enabled");
	
	
	}
	driver.close();
}
}
