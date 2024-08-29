package com.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
	//we should avoid xpath by index
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	driver.findElement(By.cssSelector("a[class*='ui-state-highlight']")).click();
	  driver.findElement(By.id("divpaxinfo")).click();
	    Thread.sleep(2000);
	    for(int i=1;i<=3;i++) {
	    driver.findElement(By.id("hrefIncAdt")).click();
	    Thread.sleep(2000);
	    }
	    
	    driver.findElement(By.id("btnclosepaxoption")).click();
	    driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	    
	    driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
}
}
