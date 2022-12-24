package locators.id_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://integrator.actitime.com/auth/at");
		driver.findElement(By.name("actiTimeUrl")).sendKeys("DINGA");
		driver.findElement(By.name("username")).sendKeys("ADMIN");
		driver.findElement(By.name("password")).sendKeys("ADMIN");
		

	}

}
