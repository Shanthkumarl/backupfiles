package praticeframework;


import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Testcase_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//enter the url
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     String parent = driver.getWindowHandle();
	     System.out.println(parent);
	  
	   
		
		
		   driver.findElement(By.name("addresstype")).click();	
		   Thread.sleep(5);
	       Set<String> child = driver.getWindowHandles();
	       System.out.println(child);
	    
	      
		   int count= child.size();
		   System.out.println("total window"+child);
		      for (String c:child ) 
		      {
			     driver.switchTo().window(parent);
	          	}
		   WebElement dropdown = driver.findElement(By.name("addresstype"));
		    Select s=new Select(dropdown);
		   s.selectByVisibleText("Testing");
		/*   WebElement src = driver.findElement(By.xpath("//img[@id='Selenium Training']"));
		   WebElement tar = driver.findElement(By.xpath("//div[@id='cartArea']"));
		  
		   Actions a=new Actions(driver);
		   
		   a.dragAndDrop(src,tar).perform();*/
		   
		   WebElement imgaddr = driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]"));
		   Point loc = imgaddr.getLocation();
		   int x=loc.getX();
		   int y=loc.getY();
		   
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   js.executeScript("window.scrollBy("+x+","+y+")");
		   
		   driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]")).click();
		

	}

}
