package frame_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.switchTo().frame(0);
	    
		 driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		 driver.switchTo().defaultContent();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
	   

	} 

}
