package pop_up;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HIdden {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

}
