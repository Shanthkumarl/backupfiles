package drop_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	WebElement dropdrown = driver.findElement(By.id("gh-cat"));
	Select s=new Select(dropdrown);
	Thread.sleep(3000);
	s.selectByIndex(6);
	Thread.sleep(3000);
	s.selectByValue("1");
	Thread.sleep(3000);
	s.selectByVisibleText("Books");
	System.out.println(s.isMultiple());
	
	
	
	}

}
