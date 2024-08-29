package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://emicalculator.net/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://tomcat.apache.org/");
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://qspiders.com/");
	Thread.sleep(5000);
	driver.quit();
}
}
