package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("seleni");

	//suggestion
	Thread.sleep(3000);
	List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
	System.out.println(ele.size());
	 
	//print that suggestion
	  for (WebElement b : ele) {
	   System.out.println(b.getText());
	   driver.close();
		
	
	
	
	  }
	

	}

}
