package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnScrollByAmount {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.manage().window().maximize();
	Actions a=new Actions(driver);
	Thread.sleep(4000);
	a.scrollByAmount(300, 400).perform();
	Thread.sleep(4000);
	a.scrollByAmount(0,-400).perform();
}
}
