package locators.css_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://demoapp.skillrary.com/login.php?type=login");
	       Thread.sleep(2000);
	       driver.findElement(By.cssSelector("input#email")).sendKeys("admin");
	       //driver.findElement(By.cssSelector("input[class=\"form-control ui-autocomplete-input\"]")).sendKeys("admin");
	       driver.findElement(By.cssSelector("input[id=\"password\"]")).sendKeys("admin");
	       driver.findElement(By.cssSelector("input[id=\"password\"]")).click();

	}

}
