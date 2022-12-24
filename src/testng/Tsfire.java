package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tsfire {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");

	}

}
