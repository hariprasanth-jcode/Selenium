package task;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FT{
@Test(groups = "FT")
public void  ft_01() {
	Reporter.log("Functional Testing 1",true);
	//System.out.println(10/0);
}

@Test(dependsOnMethods = "ft_01",groups="FT")
public void ft_02() {
	Reporter.log("Functional Testing 2",true);
}
@Test(dependsOnMethods = {"ft_01","ft_02"},groups = "FT")
public void ft_03() {
	Reporter.log("Functional Testing 3",true);
}
}
