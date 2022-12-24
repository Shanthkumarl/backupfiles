package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_1 
{
       public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();//lunching the browser
		driver.manage().window().maximize();//to maxing tge screen
		driver.get("https://demo.actitime.com/login.do");//entering the url
		driver.findElement(By.id("username")).sendKeys("admin");//using id locator typeing the inputs to user name text feild
		driver.findElement(By.name("pwd")).sendKeys("manager");//using nmaelocator typeing the inputs to  pwd text feild
		
		
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   /*WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");*/

	}

}
