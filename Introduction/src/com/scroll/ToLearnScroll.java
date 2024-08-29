package com.scroll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ToLearnScroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement ele = driver.findElement(By.id("product"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	//js.executeScript("arguments[0].scrollIntoView(true)",ele);
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	List<WebElement> ele1 = driver.findElements(By.xpath("//th[text()='Amount']/../../..//td[4]"));
	System.out.println(ele1.size());
	int sum=0;
	for( WebElement amt:ele1) {
		int a=Integer.parseInt(amt.getText());
		sum=sum+a;
	}
	System.out.println(sum);
	
	String[] value=driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(" ");
	String total = value[value.length-1];
	
	
Assert.assertEquals(sum,Integer.parseInt(total));
}
}
