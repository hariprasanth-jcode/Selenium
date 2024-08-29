package com.prac1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/QSP-USER/Downloads/Telegram%20Desktop/index.html");
	
Point	point=new Point(300, 150);
driver.manage().window().setPosition(point);
Thread.sleep(3000);
driver.close();
}
}
