package project_all_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Projectfblogin {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		    WebDriver driver =new ChromeDriver();
		    driver.get("https://www.facebook.com/");
		   
		    //by css-tag&id or #id
		    //driver.findElement(By.cssSelector("input#email")).sendKeys("pavan");
		   
		    //css-tag&class or .class
		     driver.findElement(By.cssSelector("input.inputtext")).sendKeys("pavan");
		    
		    //css-tag&attributes
		    // driver.findElement(By.cssSelector("input[name=email]")).sendKeys("pavan");
		    
		    
		    //CSS-TAG ,CLASS ,ATTRIBUTES or .input[name=email] 
		   //driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("pavan");
		   // driver.findElement(By.cssSelector("input.inputtext[name=pass]")).sendKeys("12354");

	}

}
