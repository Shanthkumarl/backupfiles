package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.Utils;

public class Amazon_home_page {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");;
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//step-1 typecasting
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//step-2 we can access the method as getScreenshotAs and store in ram 
		File src = ts.getScreenshotAs(OutputType.FILE);
         
		//step-3 required location
		File dest = new File("./photo/amazon.png");
		
		//step-4 copy and paste from ram to required location 
		FileUtils.copyFile(src, dest);
		
	}

}
