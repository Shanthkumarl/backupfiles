package drop_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Doubleselect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement drp = driver.findElement(By.id("cars"));
		Select s=new Select(drp);
		s.selectByIndex(1);
		s.selectByValue("299");
		s.selectByVisibleText("Free ( 90 ) ");
		System.out.println(s.isMultiple());
		

		
		
		
		s.deselectByIndex(1);
		s.deselectByValue("299");
		s.deselectByVisibleText("Free ( 90 ) ");
		
		
}
}
