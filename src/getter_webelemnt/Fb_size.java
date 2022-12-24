package getter_webelemnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_size {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 WebElement email = driver.findElement(By.name("email"));
	  Dimension ele = email.getSize();
	  System.out.println(ele.getHeight()+" it is heiht");
	  System.out.println(ele.getWidth()+" it is width");
	  

	}

}
