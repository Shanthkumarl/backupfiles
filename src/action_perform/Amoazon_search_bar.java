package action_perform;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amoazon_search_bar {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("computer");
	Thread.sleep(3000);
	search.clear();
}
}
