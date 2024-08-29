package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingCalenderUI {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Thread.sleep(2000);
	driver.findElement(By.className("ui-datepicker-trigger")).click();
	Thread.sleep(4000);

driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();

}
}
