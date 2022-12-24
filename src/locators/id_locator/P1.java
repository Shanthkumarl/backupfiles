package locators.id_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.id("email")).sendKeys("shanthkumar");
	driver.findElement(By.id("pass")).sendKeys("SK660507883");
	driver.findElement(By.name("login")).click();
	
	
}
}
