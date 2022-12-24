package navigation.Api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//back
		driver.navigate().back();
		Thread.sleep(1000);
		//forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//refesh
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		

	}

}
