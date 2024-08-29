package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIelementDisabledorEnabled {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_1']")).click();
	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
		System.out.println("its Enbaled");
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

}
}
