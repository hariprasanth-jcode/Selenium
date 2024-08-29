package takescreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TotakeScreenShot {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement logo = driver.findElement(By.cssSelector("img[class='fb_logo _8ilh img'"));
	Thread.sleep(2000);
	File source = logo.getScreenshotAs(OutputType.FILE);
	Thread.sleep(2000);
	File destiny=new File("./snap/screenshot.png");
	Thread.sleep(2000);
	FileHandler.copy(source, destiny);
}
}
