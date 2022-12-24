package project_all_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Vtiger{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver = new ChromeDriver();
		  // enter the url of VTiger
		  driver.get("http://localhost:8888");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		/*  //enter username nad password and click on login
		  driver.findElement(By.name("user_name")).sendKeys("admin");
		  driver.findElement(By.name("user_password")).sendKeys("admin");
		  driver.findElement(By.id("submitButton")).submit();
		  
		  driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		  // click on + button to create new organizations
		  driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		  // enter valid data --> organization name 
		  driver.findElement(By.name("accountname")).sendKeys("QAlZ1 ");
		    
		  // click on save button
		  driver.findElement(By.name("button")).click(); // when clicking on save button mouse hovering not working
		      Thread.sleep(3000);
		  WebElement a = driver.findElement(By.xpath("(//td[@class='small'])[2]"));
		  Actions a1=new Actions(driver);
		  a1.moveToElement(a).perform();
		  driver.findElement(By.linkText("Sign Out")).click();*/
	}

}