package scroll_bar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipchart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		  WebElement img = driver.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[7]"));
		  Point loc = img.getLocation();
	      System.out.println(loc.getX());
	      System.out.println(loc.getY());
	      int x=loc.getX();
	      int y=loc.getY();
		//Thread.sleep(2);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

}
