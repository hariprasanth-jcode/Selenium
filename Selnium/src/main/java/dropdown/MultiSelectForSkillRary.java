package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectForSkillRary {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.id("details-button")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("proceed-link")).click();
		Thread.sleep(4000);
		WebElement ele1 = driver.findElement(By.name("addresstype"));
		Select s = new Select(ele1);
		s.selectByIndex(2);
		WebElement ele2=driver.findElement(By.id("cars"));
		Select s1=new Select(ele2);
		s1.selectByIndex(1);
		s1.selectByValue("299");
		s1.selectByValue("399");
		List<WebElement> s2 = s1.getAllSelectedOptions();
		for(int i=0;i<s2.size();i++) {
			System.out.println(s2.get(i).getText());
		}
		
	}
}
