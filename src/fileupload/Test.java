package fileupload;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import bsh.Remote;

public class Test {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	     
		WebDriver driver=new ChromeDriver();
		System.out.println(driver);
       driver.manage().window().maximize();
       driver.manage().window().getSize();
        driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
       Runtime.getRuntime().exec("/home/shanth/AutoIt");
      
	}

}
