package childbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		
		String parent = driver.getWindowHandle();
		 System.out.println(parent);
	    driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	   
	   
	    

	    
	    driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	    for (String b : child) {
			driver.switchTo().window(b);
		}
	    WebElement text =driver.findElement(By.id("mytext"));
	    text.sendKeys("PAVAN");
	     driver.findElement(By.xpath("//input[@type='button']")).click();
	      text.click();
	      
	      driver.switchTo().window(parent);
	      driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
	     
	    
	      
	     
	}

}
