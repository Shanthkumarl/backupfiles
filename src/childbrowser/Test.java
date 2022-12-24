package childbrowser;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
     
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
         String add1 = driver.getWindowHandle();
         System.out.println(add1);
        //new tab
         driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.naukri.com/");
      
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> add2 = driver.getWindowHandles();
        System.out.println(add2);
        //
        //driver.close();
        driver.quit();
        
	}

}
