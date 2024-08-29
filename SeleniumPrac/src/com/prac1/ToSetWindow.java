package com.prac1;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetWindow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP-USER/Downloads/Telegram%20Desktop/index.html");
     Dimension dimension=new Dimension(1000, 1500);
	driver.manage().window().setSize(dimension);
	Thread.sleep(10000);
	driver.close();
}
}
