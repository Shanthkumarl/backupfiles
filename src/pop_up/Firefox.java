package pop_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");

	}

}
