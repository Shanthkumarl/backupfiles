package project_all_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	    WebDriver driver =new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	   /* driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("dress");
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
	   */
      /*driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dress");
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();*/
	
	    //xpath -with OR
	    /* driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search_query***']")).sendKeys("dress");
	     driver.findElement(By.xpath("//button[@type='submit***' or @name='submit_search']")).click();
	    */
	
	    
	    //Xpath -with AND 
	    // driver.findElement(By.xpath("//input[@class='search_query form-control ac_input' and @id='search_query_top']")).sendKeys("dress");
	    //driver.findElement(By.xpath("//button[@class='btn btn-default button-search' and @type='submit']")).click();

	    //  xpath-with contains
	    //driver.findElement(By.xpath("//input[contains(@id,'search')]")).sendKeys("dress");
	    //driver.findElement(By.xpath("//button[contains(@name,'submit_')]")).click();
	    
	    
	    //Xpath-start-with()
	   // driver.findElement(By.xpath("//input[starts-with(@id,'search')]")).sendKeys("dress");//id=search_query_top
	   // driver.findElement(By.xpath("//button[starts-with(@name,'submit_')]")).click();// name =submit_search
	    ////Xpath -text()
	    //driver.findElement(By.xpath("//a[text()='Women']")).click();
	    
	    // Xpath chained 
	    driver.findElement(By.xpath("//form[@id='searchbox']//input[@id='search_query_top']")).sendKeys("dress");
	    driver.findElement(By.xpath("//form[@id='searchbox']//button[@name='submit_search']")).click();
	  
	   
	}
		
	

}
