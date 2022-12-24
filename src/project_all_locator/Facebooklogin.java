package project_all_locator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pavan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8660589989");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Shan@123");
		Select sel1=new Select(driver.findElement(By.xpath("//select[@id='day']")));
		sel1.selectByIndex(4);
		Select sel2=new Select(driver.findElement(By.xpath("//select[@id='month']")));
		sel2.selectByValue("8");
		Select sel3=new Select(driver.findElement(By.xpath("//select[@id='year']")));
		sel3.selectByVisibleText("1999");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.linkText("Already have an account?")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		

	}

}
