package batch;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FT02 {
@Test
public void ft_01() {
	Reporter.log("FT02",true);
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
}
}
