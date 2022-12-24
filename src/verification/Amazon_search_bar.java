package verification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_search_bar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		 WebElement bar = driver.findElement(By.id("twotabsearchtextbox"));
        if (bar.isDisplayed()) 
        {
			System.out.println("pass: it is  displayed");
			bar.sendKeys("phone");
			bar.sendKeys(Keys.ENTER);
		} 
        else 
        {
            System.out.println("fail: it is not displayed");
		} 
        driver.close();
	}

}
