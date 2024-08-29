package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ToLearnScolltoElement3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	WebElement ele = driver.findElement(By.cssSelector("i[class*='ico resman-icon resman-icon-check-box']"));
  Actions a=new Actions(driver);
  ScrollOrigin s = ScrollOrigin.fromElement(ele);
  a.scrollFromOrigin(s, 0, 100).click(ele).perform();
}
}
