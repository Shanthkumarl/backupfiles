package action_perform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getloc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loc = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Point locs = loc.getLocation();
	   int x= locs.getX();
		int y=locs.getY();
		System.out.println(x);
		System.out.println(y);
	}

}
