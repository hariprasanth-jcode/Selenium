package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shoppersstack.com/products_page/16");
	Thread.sleep(20000);
	driver.findElement(By.id("compare")).click();
	Set<String> all_id = driver.getWindowHandles();
	System.out.println(all_id.size());
	List<String> li=new ArrayList(all_id);
for(int i=0;i<all_id.size();i++) {
	if(i!=0) {
		WebDriver res = driver.switchTo().window(li.get(i));
		res.manage().window().maximize();
		res.quit();
	}
	Thread.sleep(10000);
}
}
}
