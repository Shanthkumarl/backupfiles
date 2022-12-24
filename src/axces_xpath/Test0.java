package axces_xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/home/shanth/eclipse-workspace/seleniumJava/Resource/chromedriver");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
      
      driver.get("https://money.rediff.com/gainers");
    //self-select the current node(only one)
      String text = driver.findElement(By.xpath("//a[contains(text(),'Suratwwala Business')]/self::a")).getText();
     System.out.println(text);
      
      //parent-select the parent from current node(only one)
       text = driver.findElement(By.xpath("	//a[contains(text(),'Suratwwala Business')]/parent::td")).getText();
      System.out.println(text);
	
      //child-select all children from current node(one or many)
      List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Suratwwala Business')]/ancestor::tr/child::td"));
      	System.out.println(childs.size());
      
     //ancestor-select all ancestor(parent,grand parent,etc)
      text = driver.findElement(By.xpath("//a[contains(text(),'Suratwwala Business')]/ancestor::tr")).getText();
      	System.out.println(text);
	
      	//descendant-select all descendant (child,grandchild)of current node  
      	List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Suratwwala Business')]/ancestor::tr/descendant::*"));
        System.out.println( descendant.size());
	
        //folowing-select everthing in the document after closing of current tag
        List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'Suratwwala Business')]/ancestor::tr/following::tr"));
	  System.out.println(following.size());
	  //following-sibling -select all siblings after current node
	List<WebElement> followingsibling = driver.findElements(By.xpath("//a[contains(text(),'Suratwwala Business')]/ancestor::tr/following-sibling::tr"));
	  System.out.println(followingsibling.size());
	  
	  //preceding -select all that nodes appear before the current node document
	  List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Navoday Enterprises')]/ancestor::tr/preceding::tr"));
	   System.out.println(preceding.size());
	   
	   //preceding-sibling-select all the siblings  node before current node
	   List<WebElement> precedingsibling = driver.findElements(By.xpath("//a[contains(text(),'Navoday Enterprises')]/ancestor::tr/preceding-sibling::tr"));
	  System.out.println( precedingsibling.size());
	
	}


	
	
	
}
