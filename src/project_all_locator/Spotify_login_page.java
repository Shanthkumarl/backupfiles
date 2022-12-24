package project_all_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify_login_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/in-en/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("adim");
		driver.findElement(By.xpath("//input[@data-testid='login-password']")).sendKeys("123456");
		          driver.findElement(By.xpath("//span[contains(@class,'Indicator-sc-1airx73-0 kHTWAk')]")).click();
		driver.findElement(By.id("login-button")).click();
		
		

	}

}
