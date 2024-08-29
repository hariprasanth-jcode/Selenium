package com.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//	driver.findElement(By.id("autosuggest")).sendKeys("ind");
//	Thread.sleep(3000);
//	
//	List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] /a"));
//	
//	for(WebElement option:options) {
//		if(option.getText().equalsIgnoreCase("India")) {
//			option.click();
//			break;
//		}
//	}
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
	System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
	List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkbox.size());
	
}
}
