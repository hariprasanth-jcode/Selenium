package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Emi {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://emicalculator.net/");

//
//    JavascriptExecutor js = (JavascriptExecutor)driver;
//
//     //Vertical scroll – down by 150  pixels
//
//     js.executeScript("window.scrollBy(0,400)");

	List<WebElement>  ele=driver.findElements(By.xpath("//*[local-name()='svg']//*[name()='g' and @class='highcharts-markers highcharts-series-2 highcharts-spline-series highcharts-tracker']//*[name()='path']"));
	
	System.out.println(ele.size());
	Actions a=new Actions(driver);
	
	for(WebElement webelement:ele) {
		a.moveToElement(webelement).perform();

		Thread.sleep(500);
	}
	
	
}
}
