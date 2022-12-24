package scroll_bar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");;
		
		///home/shanth/eclipse-workspace/seleniumJava/resource/chromedriver
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//typcastings
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//TOP TO BUTTOM
		js.executeScript("window.scrollBy(0,5000)"); 
        //BUTTOM TO TOP
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-5000)");
	}
 
}
