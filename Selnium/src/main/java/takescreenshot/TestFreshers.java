package takescreenshot;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestFreshers {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testfreshers.com/");
	Thread.sleep(5000);
	WebElement e = driver.findElement(By.xpath("//a[text()='Login']"));
//   TakesScreenshot ts = (TakesScreenshot)driver;
//   Thread.sleep(2000);
   File src=e.getScreenshotAs(OutputType.FILE);
   Thread.sleep(2000);
   String des="./snap/t1.png";
   File f=new File(des);
   Thread.sleep(2000);
  FileHandler.copy(src, f);
}
}
