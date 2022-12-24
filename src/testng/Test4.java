package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test (priority=-1)
	public void setting() {
		Reporter.log("setting",true);
	}

	@Test(priority=-1, invocationCount = 3,enabled = false)
	public void chats() {
		Reporter.log("chats",true);
	}

	@Test(invocationCount =5)
	public void calls() {
		Reporter.log("calls",true);
}
}
