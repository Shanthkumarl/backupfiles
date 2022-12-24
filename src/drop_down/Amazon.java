package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdowm = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(dropdowm);
		Thread.sleep(2000);
		s.selectByIndex(5);
		Thread.sleep(2000);
		s.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(2000);
		s.selectByVisibleText("Boys' Fashion");
		
	     List<WebElement> alloptions = s.getOptions();
	    System.out.println( alloptions.size());
         for (WebElement opt : alloptions) {
	     System.out.println(opt.getText());  
	  
       }
	}

}
