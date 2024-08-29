package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement singleSelect = driver.findElement(By.id("drop1"));
		Select s = new Select(singleSelect);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByValue("mno");
		Thread.sleep(2000);
		s.selectByVisibleText("Older Newsletters");
	}
}
