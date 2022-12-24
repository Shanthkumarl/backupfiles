package testng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
@DataProvider
public Object getData(){
Object[][] a=new Object[3][2];
a[0][0]="cnckccsxn";
a[0][1]="skjcsjncs";

a[1][0]="2155615151";
a[1][1]="515151151";

a[2][0]="sjc123#^%^*Y(";
a[2][1]="gdga311@%%^(*)";
return a;
}

@Test(dataProvider = "getData")
public void login(String username,String pwd) {
	System.setProperty("webdriver.chrome.driver","/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.id("email")).sendKeys(username);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.close();
}

}
