package takescreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot1 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	TakesScreenshot tks = (TakesScreenshot)driver;
	Thread.sleep(5000);
	File source= tks.getScreenshotAs(OutputType.FILE);
	Thread.sleep(5000);
	File destiny=new File("./snap/screenshot1.png");
	Thread.sleep(5000);
	FileHandler.copy(source, destiny);
	Thread.sleep(5000);
	driver.quit();
}
}
