package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver5 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Forgotten password?")).click();
driver.findElement(By.name("email")).sendKeys("8660507883");
driver.findElement(By.name("did_submit")).click();

	}

}
