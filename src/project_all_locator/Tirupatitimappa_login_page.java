package project_all_locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tirupatitimappa_login_page {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.lenskart.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("wzrk-confirm")).click();
	driver.findElement(By.name("firstName")).sendKeys("pavan");
	driver.findElement(By.name("lastName")).sendKeys("reddy");
	driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("8662050789");
	driver.findElement(By.name("email")).sendKeys("basavagudi");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shanth@123");
	
	
	
	
	
	
	}

}
