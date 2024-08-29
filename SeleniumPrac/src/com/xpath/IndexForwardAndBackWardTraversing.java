package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndexForwardAndBackWardTraversing {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP-USER/Downloads/Telegram%20Desktop/index.html");
	 WebElement ele = driver.findElement(By.xpath("//*[@id='bangalore']"));
	 ele.click();
	 ele=ele.findElement(By.xpath("//*[@id='bangalore']/../../..//*[@id='email']"));
	 Thread.sleep(2000);
	 ele.sendKeys("hari.mba000@gmail.com");
	 Thread.sleep(2000);
	ele=ele.findElement(By.xpath("//*[@id='bangalore']/../../..//*[@id='email']/../../..//*[@id='feedback']"));
	 Thread.sleep(2000);
	 ele.sendKeys("Hello Good");
	 Thread.sleep(2000);
	 driver.close();
	
}
}
