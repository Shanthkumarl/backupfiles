package childbrowser;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	     
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String p = driver.getWindowHandle();
        System.out.println(p);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.skillrary.com/");
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> C = driver.getWindowHandles();
        System.out.println(C);
        
      
	}

}
