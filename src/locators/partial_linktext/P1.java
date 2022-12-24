package locators.partial_linktext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
WebDriver driver=new ChromeDriver();
driver.get("https://demoapp.skillrary.com/login.php?type=login");
driver.findElement(By.id("email")).sendKeys("admin");
driver.findElement(By.id("password")).sendKeys("admin");
driver.findElement(By.partialLinkText("Forgot")).click();
	}

}
