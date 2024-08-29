package autosuggstion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToHandleAutoSuggestion {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.findElement(By.name("q")).sendKeys("a");
	Thread.sleep(2000);
	List<WebElement> ele=driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
    for(WebElement e:ele) {
    	if(e.getText().contains("air")) {
    		e.click();
    	}
    }
}
}
