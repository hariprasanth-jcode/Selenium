package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToCheck_testNg {
@Test
public  void m1() {
	Reporter.log("Hi");
	Reporter.log("Hi",true);
}
}
