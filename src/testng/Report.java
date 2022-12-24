package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {
@Test
public void tc() {
	Reporter.log("hel",false);
}
}
 