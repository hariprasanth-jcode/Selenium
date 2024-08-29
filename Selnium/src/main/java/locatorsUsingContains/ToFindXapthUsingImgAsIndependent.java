package locatorsUsingContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindXapthUsingImgAsIndependent {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/apparel-shoes");
	driver.findElement(By.xpath("//img[@alt=\"Picture of Casual Golf Belt\"]/../../..//input[@type=\"button\"]")).click();
}
}
