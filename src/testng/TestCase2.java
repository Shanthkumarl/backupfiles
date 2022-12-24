package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2 {
public WebDriver driver;
@BeforeMethod
public void openapp() {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

@Test
public void login() {
	driver.findElement(By.linkText("Forgotten account?")).click();
	Reporter.log(driver.getCurrentUrl(),true);
	Reporter.log(driver.getTitle(),true);
	driver.findElement(By.id("identify_email")).sendKeys("123555959");
	driver.findElement(By.id("did_submit")).click();
}

@AfterMethod
public void closeapp() {
	driver.close();
}

	
	


}

