package batch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FT01 {
@Test
public void ft_01() {
	
	Reporter.log("FT01",true);
	ChromeDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
	//System.out.println(10/0);
}
@Test
public void ft_02() {
	
	Reporter.log("FT01 2",true);
	ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.com/");
	//System.out.println(10/0);
}
}
