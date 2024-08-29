package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.opencart.com/");
//Xpath with single attribute
//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Tshirts");

//driver.findElement(By.xpath("//button[@class= 'btn btn-light btn-lg']")).click();

//Xpath with multiple attribute
//driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("TShirt");

//Xpath with and operator
//driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("TShirt");
//Thread.sleep(5000);
//xpath with text() ------> inner text
 //WebElement element = driver.findElement(By.xpath("//a[text()='MacBook']"));
//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
//((JavascriptExecutor)driver).executeScript("arguments[0].click()", element);
//element.click();
//
String value=driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
}
}
