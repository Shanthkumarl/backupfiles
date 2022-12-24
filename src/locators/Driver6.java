package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.runtime.model.WebDriverValue;

public class Driver6 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/resource/chromedriver");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=login");
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin");
	driver.findElement(By.partialLinkText("Forgot")).click();
}
}
