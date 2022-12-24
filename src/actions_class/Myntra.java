package actions_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement module = driver.findElement(By.xpath("(//div[@class='desktop-navLink'])[4]"));
			Actions a =new Actions(driver);
			a.moveToElement(module).perform();
	}

}
