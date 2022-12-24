package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration username
public class Actitime {
@FindBy(id="username")
private WebElement usernametextbox;
//declaration password
@FindBy(name="pwd")
private WebElement passwordtextbox;
//declaration loginbuton
@FindBy(xpath="//div[text()='Login ']")
private WebElement loginbutton;
//initailization 
Actitime(WebDriver driver){
	PageFactory.initElements(driver,this);
}
//utilization username
public void username(String name) {
	usernametextbox.sendKeys(name);
}
//utilization password
public void password(String password) {
	passwordtextbox.sendKeys(password);
}
//utilization loginbuton
public void loginbutton() {
	loginbutton.click();
}
}
