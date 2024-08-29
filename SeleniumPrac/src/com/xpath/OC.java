package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 class OC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/");
	//String value=driver.findElement(By.xpath("//*[text()='Featured']")).getText();
	//System.out.println(value);
	
	//WebElement element = driver.findElement(By.xpath("//a[text()='MacBook']"));
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()", element);
	
	//driver.findElement(By.xpath("//input[contains(@placeholder,'earch')]")).sendKeys("Tshirt");
	
	driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("Tshirt");
}
}
