package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class StatusCodeOfMultipleCode {
public static void main(String[] args) throws MalformedURLException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement table = driver.findElement(By.xpath("//table[@class='gf-t']"));
	List<WebElement> links = table.findElements(By.xpath("//table[@class='gf-t']//a"));
	HttpURLConnection con=null;
	String url=null;
	SoftAssert a = new SoftAssert();
	for(int i=0;i<links.size();i++) {
		url = links.get(i).getAttribute("href");
		 con = (HttpURLConnection)new URL(url).openConnection();
		 System.out.println("The Link with following Text "+links.get(i).getText() +"is Broken "+con.getResponseCode());
		a.assertTrue(con.getResponseCode()<400, "The Link with following Text "+links.get(i).getText() +"is Broken "+con.getResponseCode());
	}
	a.assertAll();
}
}
