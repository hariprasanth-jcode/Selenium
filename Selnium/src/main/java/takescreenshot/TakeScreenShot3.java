package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		WebElement ele = driver.findElement(By.cssSelector("input[value*='Log']"));
		ele.click();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebElement error = driver.findElement(By.cssSelector("div[class=message-error]"));
		
		File source = error.getScreenshotAs(OutputType.FILE);
		
		File destiny = new File("./snap/scrns3.png");
		
		FileHandler.copy(source, destiny);

	}
}
