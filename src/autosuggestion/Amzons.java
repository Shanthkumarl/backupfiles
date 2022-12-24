package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import action_perform.Getsize;
import net.bytebuddy.description.annotation.AnnotationValue.ForAnnotationDescription;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Amzons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		List<WebElement> eles = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println(eles.size());
		for (WebElement a : eles) {
			System.out.println(a.getText());
		}
		

	}

}
