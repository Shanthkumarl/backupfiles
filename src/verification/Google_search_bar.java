package verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_search_bar {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement bar = driver.findElement(By.name("q"));
	if (bar.isDisplayed()) 
	{
		System.out.println("pass: is is displayed");
	}
	else
	{
		System.out.println("fial: is not displayed");
	}
	driver.close();

	}

}
