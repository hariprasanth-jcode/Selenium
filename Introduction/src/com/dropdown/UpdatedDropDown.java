package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropDown {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    driver.findElement(By.id("divpaxinfo")).click();
    Thread.sleep(2000);
    for(int i=1;i<=3;i++) {
    driver.findElement(By.id("hrefIncAdt")).click();
    Thread.sleep(2000);
    }
    Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
    System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
    driver.findElement(By.id("btnclosepaxoption")).click();
    driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
    //Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).isSelected());
    System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
    driver.quit();
}
}
