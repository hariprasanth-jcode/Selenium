package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithOutUsingSelectClass {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/books");
	WebElement singleSelect = driver.findElement(By.id("products-orderby"));
singleSelect.click();
List<WebElement> option = driver.findElements(By.xpath("//*[@id='products-orderby']//option"));

Robot robot=new Robot();
for(int i=0;i<option.size();i++) {
	String res = option.get(i).getText();
	System.out.println(res);
	if(res.equals("Price: Low to High")) {
		
		robot.keyPress(KeyEvent.VK_ENTER);
	break;
	}
robot.keyPress(KeyEvent.VK_DOWN);

}
}
}
