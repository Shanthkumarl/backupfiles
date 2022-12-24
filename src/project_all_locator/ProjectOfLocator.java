package project_all_locator;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectOfLocator {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
    WebDriver driver =new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");
    
    
    WebElement searchbox= driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']"));
    searchbox.sendKeys("dress");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
 
    //by linktext-lacator
    //driver.findElement(By.linkText("Printed Chiffon Dress")).click();
   
    //by partial lacator
      driver.findElement(By.partialLinkText("Chiffon Dress")).click();
    
    //by xpath-lacator
    //driver.findElement(By.xpath("//a[@class='product-name']")).click();

    
			

	}

}
