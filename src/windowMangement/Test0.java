package windowMangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver= new ChromeDriver();
		//maximize
		driver.manage().window().maximize(); 
		driver.get("https://www.skillrary.com/");
		
		Thread.sleep(4000);
	// fullscreen
		driver.manage().window().fullscreen();
		
		Thread.sleep(5000);
		//minimize
		driver.manage().window().minimize();
	}

}
