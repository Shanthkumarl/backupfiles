package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ebay.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement drop = driver.findElement(By.id("gh-cat"));
	Select s=new Select(drop);
	//s.selectByIndex(5);
	//s.selectByVisibleText("Books");
	s.selectByValue("267");
	List<WebElement> opt = s.getOptions();
	System.out.println(opt.size());
	s.deselectAll();
	for(WebElement b:opt ) {
		System.out.println(b.getText());
	}
}
}
