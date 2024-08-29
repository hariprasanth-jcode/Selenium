package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dassault-aviation.com/en/");
	List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='menu-main-menu']/li/a"));
	System.out.println(ele.size());
	
	Actions a=new Actions(driver);
	for(int i=0;i<ele.size();i++) {
		a.moveToElement(ele.get(i)).perform();
		if(ele.get(i).getText().contains("PASSION")) {
			passion(driver);
		}
		Thread.sleep(2000);
	}

	
}
public static void passion(WebDriver driver) throws InterruptedException {
	List<WebElement> ele = driver.findElements(By.xpath("//div[@class='menu__label']/a"));
	Actions a=new Actions(driver);
	for(int i=0;i<ele.size();i++) {
		a.moveToElement(ele.get(i)).perform();
		Thread.sleep(2000);
	}
}
}
