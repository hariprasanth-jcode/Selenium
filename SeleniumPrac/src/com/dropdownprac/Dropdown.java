package com.dropdownprac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP-USER/Downloads/Telegram%20Desktop/index.html");
	Thread.sleep(2000);
	driver.findElement(By.name("dob")).click();
	
}
}
