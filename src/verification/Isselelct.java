package verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselelct {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//a[text()='Create New Account']"));
	   WebElement radio = driver.findElement(By.xpath("(//input [@type='radio'])[1]"));
	   if(radio.isSelected()) {
		   System.out.println("pass ");
	   }else
	   {
		   System.out.println("fail");
	   }
	    

	}

}
