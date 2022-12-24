package explicitlywait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipchartlogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(2));
	
	WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
     w.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
		
	WebElement password = driver.findElement(By.xpath("(//input[@type='password'])"));
	w.until(ExpectedConditions.visibilityOf(password)).sendKeys("1234567");
	
	WebElement button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	w.until(ExpectedConditions.elementToBeClickable(button)).click();
	 String tittle = driver.getTitle();
	 w.until(ExpectedConditions.titleContains("flipkart"));
	 
	 WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(2));
	 w1.
}

}
