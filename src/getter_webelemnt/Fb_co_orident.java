package getter_webelemnt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_co_orident {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   WebElement email = driver.findElement(By.name("email"));
		//System.out.println(email.getLocation());
		    Point loc = email.getLocation();
		    System.out.println(loc.getX()+"it is a x-corident");
		    System.out.println(loc.getY()+"it is a y-corident");

	}

}
