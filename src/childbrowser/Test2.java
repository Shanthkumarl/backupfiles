package childbrowser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		String parent = driver.getWindowHandle();
	     driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
	     driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
	   
	    Set<String> child = driver.getWindowHandles();
	   
	  
	    for (String b: child)
	    {
		driver.switchTo().window(b);
		}
	     WebElement mod = driver.findElement(By.xpath("//a[text()='COURSE']"));
	     Actions a=new Actions(driver);
	     a.moveToElement(mod).perform();
	     driver.findElement(By.xpath("(//a[text()='Selenium Training'])[1]")).click();
	     
	     
	     
	}

}
