package task;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IT {
@Test(dependsOnGroups = "FT")
public void IT_01() {
	Reporter.log("IT 1",true);
	
}
@Test(dependsOnGroups = "FT")
public void IT_02() {
	Reporter.log("IT 2",true);
}
}
