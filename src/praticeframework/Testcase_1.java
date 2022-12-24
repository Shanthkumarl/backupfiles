package praticeframework;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testcase_1 {

	public static void main(String[] args) {
		//open the browser
		
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String parent = driver.getWindowHandle();
		//click on gear
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		//click on skillrary demo app
		driver.findElement(By.xpath("(//a[@class='ignorelink'])[16]")).click();
		//switch the control to new tab
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
		//mousehover on cource
		WebElement mousehover = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a=new Actions(driver);
		a.moveToElement(mousehover).perform();
		//select selenium training
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
		//double click on plus button
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='add']"));
		a.doubleClick(doubleclick).perform();
		//add to cart
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		//handle alert pop up and click on ok 
		driver.switchTo().alert().accept();
		

	}

}
