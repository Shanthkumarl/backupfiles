package frame_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = driver.findElement(By.xpath("//div[@class='accountInner']"));
        Actions a=new Actions(driver);
        a.moveToElement(search).perform();
        
        driver.findElement(By.xpath("//a[text()='login']")).click();
        
        driver.switchTo().frame(0);
       
        driver.findElement(By.id("userName")).sendKeys("8660507883");
        driver.findElement(By.xpath("//div[@id='close-pop']")).click();
        
        driver.switchTo().defaultContent();
        driver.findElement(By.name("keyword")).sendKeys("phone");
        driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
        
        
        
	}

}
