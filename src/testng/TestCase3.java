package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
WebDriver driver;
@BeforeMethod
public void openapp() {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@Test
public void createpage() {
	driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
	Reporter.log(driver.getCurrentUrl(),true);
	Reporter.log(driver.getTitle(),true);
	driver.findElement(By.xpath("(//div[text()='Get Started'])[1]")).click();
	
	
}
@AfterMethod
public void closeapp() {
	driver.close();
}
}
