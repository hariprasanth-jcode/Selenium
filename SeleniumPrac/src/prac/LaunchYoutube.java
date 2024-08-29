package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchYoutube {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	WebElement res = driver.findElement(By.cssSelector("input[name='search_query']"));
	res.sendKeys("Hukum");
	driver.findElement(By.className("button[class='style-scope ytd-searchbox']")).submit();
	
}
}
