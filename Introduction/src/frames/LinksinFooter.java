package frames;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksinFooter {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement e = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	//System.out.println(e.size());
	WebElement e1 = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
	System.out.println(e1.findElements(By.tagName("a")).size());
	WebElement column = e1.findElement(By.xpath("//div[@id='gf-BIG']//td[1]//ul"));
	System.out.println(column.findElements(By.tagName("a")).size());
	
	
	for(int i=1;i<column.findElements(By.tagName("a")).size();i++) {
		String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
		column.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
	}
	
	Set<String> title = driver.getWindowHandles();
  Iterator<String> i=title.iterator();
  
  while(i.hasNext()) {
	 System.out.println( driver.switchTo().window(i.next()).getTitle());
  }
}
}
