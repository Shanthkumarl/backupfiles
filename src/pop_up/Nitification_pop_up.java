package pop_up;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nitification_pop_up {

	public static void main(String[] args) {
		
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");*/
		
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://whatmylocation.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	} 

}
