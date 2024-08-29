package brokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
public static void main(String[] args) throws MalformedURLException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	String url=driver.findElement(By.xpath("//a[text()='Broken Link']")).getAttribute("href");
	System.out.println(url);
	HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
	//con.setRequestMethod("HEAD");
	//con.connect();
	System.out.println(con.getResponseCode());
}
}
