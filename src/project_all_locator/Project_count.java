package project_all_locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project_count {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		    WebDriver driver =new ChromeDriver();
		    driver.get("http://automationpractice.com/index.php");
		   int slider= driver.findElements(By.className("homeslider-container")).size();
		   System.out.println("the num of slider: "+slider);
		   int links =driver.findElements(By.tagName("a")).size();
		   System.out.println("the num oflinks is :"+links);
		    

	}

}
