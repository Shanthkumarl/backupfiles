package drop_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s=new Select(dropdown);
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.selectByValue("99");
		Thread.sleep(1000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		
	   //Thread.sleep(1000);
		s.deselectByIndex(0);
		Thread.sleep(1000);
		s.deselectByValue("99");
		Thread.sleep(1000);
		//s.deselectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		System.out.println(s.isMultiple());
		Thread.sleep(2000);
       if(s.isMultiple())
       {
    	   s.deselectAll();
    	   System.out.println("its is a multiselect");
       }
       else
       {
    	   System.out.println("its a single select");
       }
		
		
		

	}

}
