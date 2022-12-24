package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class prioirty {
@Test(priority = 1)
public void chats() {
	Reporter.log("heloo",true);
}
@Test(priority = -1,enabled = false)
public void staus() {
	Reporter.log("ssss",true);
}
@Test(priority = 3,invocationCount = 2)
public void mess() {
	Reporter.log("mmmm",true);
}


}
