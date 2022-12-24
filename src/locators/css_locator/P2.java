package locators.css_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("admin");
	driver.findElement(By.cssSelector("button[value=\"1\"]")).click();

	}

}
