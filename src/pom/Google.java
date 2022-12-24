package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {

	//declaration
		@FindBy(name="q")
		private WebElement searchtb;
		
 // initailization
		
		Google(WebDriver driver){
			PageFactory.initElements(driver,this);
		}
//utilization
		public void search(String name){
			searchtb.sendKeys(name);
		}

	}
 

