package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Testdriver {
@FindBy(id="email")
private WebElement username;

@FindBy(name="pass")
private WebElement passwordtb;

@FindBy(name="login")
private WebElement loginbuuton;

public Testdriver(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void useername(String name) {
	username.sendKeys(name);
}
public void password(String pass){
passwordtb.sendKeys(pass);	


}
}