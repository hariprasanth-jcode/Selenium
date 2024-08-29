package com.prac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/QSP-USER/Downloads/Telegram%20Desktop/index.html");
	WebElement element = driver.findElement(By.id("name"));
	element.clear();
	element.sendKeys("HariPrasanth");
	element=driver.findElement(By.name("email"));
	element.clear();
	element.sendKeys("hari.mba000@gmail.com");
	element=driver.findElement(By.cssSelector("input[name*='dob']"));
	element.submit();
}
}
