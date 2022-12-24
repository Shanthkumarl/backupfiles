package navigation.Api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	//change to other apll
	driver.navigate().to("https://www.amazon.in/");
	//wait
	Thread.sleep(1000);
	//back
	driver.navigate().back();
	Thread.sleep(1000);
	//forward
	driver.navigate().forward();
	//refesh
	driver.navigate().refresh();
	
}
}
