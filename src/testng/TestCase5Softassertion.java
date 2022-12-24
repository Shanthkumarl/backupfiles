package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase5Softassertion {
	WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		
		@Test
		public void loginpage() {
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pavan");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
			driver.findElement(By.name("login")).click();
			String title = driver.getTitle();
			Reporter.log(title,true);
			SoftAssert s=new SoftAssert();
			s.assertEquals(title,"shvchasvja");
			String url = driver.getCurrentUrl();
			Reporter.log(url,true);
		}
		
		@AfterMethod
		public void closeapp() {
			driver.close();
		}
}
