package jsew;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearn_ScrollTo {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	JavascriptExecutor js= (JavascriptExecutor)driver;
//	js.executeScript("window.scrollTo(0,600)");
//	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,-600)");
	Thread.sleep(4000);
	js.executeScript("window.scrollBy(0,-600)");
	Thread.sleep(4000);
	//js.executeScript("window.scrollTo(0,-600)");
	
}
}
