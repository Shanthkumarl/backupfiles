package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
@FindBy(id="email")
private WebElement emailtextbox;

@FindBy(id="pass")
private WebElement passwordtextbox;

@FindBy(name="login")
private WebElement loginbutton;

Facebook(WebDriver driver ){
	PageFactory.initElements(driver,this);
}

void username(String name){
	emailtextbox.sendKeys(name);
}

void passwaord(String password) {
passwordtextbox.sendKeys(password);
}

void loginbutton() {
	loginbutton.click();
}
}
