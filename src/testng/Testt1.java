package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testt1 {
@Test
public void tc1() {
	Reporter.log("hello",true);
	Reporter.log("java",false);
}
}
