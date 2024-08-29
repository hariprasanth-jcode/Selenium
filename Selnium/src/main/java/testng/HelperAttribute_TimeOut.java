package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperAttribute_TimeOut {
@Test
public void register() {
	Reporter.log("from method Register",true);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	System.out.println(10/0);
	driver.get("https://demowebshop.tricentis.com/");
	driver.close();
	
}
@Test(dependsOnMethods = "register",alwaysRun = true)
public void login() {
	Reporter.log("from method Login",true);
	//System.out.println(10/0);
	//System.out.println(10/0);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.close();
	
}
}
