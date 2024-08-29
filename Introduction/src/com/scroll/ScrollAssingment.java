package com.scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAssingment {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500)");
	System.out.println(driver.findElements(By.xpath("//table[@name='courses']//tr")).size());
	System.out.println(driver.findElements(By.xpath("//table[@name='courses']//th")).size());
	System.out.println(driver.findElement(By.xpath("//table[@name='courses']//tr[3]")).getText());
	
	
}
}
