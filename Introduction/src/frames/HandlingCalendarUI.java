package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendarUI {
public static void main(String[] args) {
	String year="2023";
	String month="6";
	String days="5";
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
     driver.findElement(By.xpath("//button[@class='react-date-picker__calendar-button react-date-picker__button']")).click();
     driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']//span")).click();
     driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']//span")).click();
     driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
     List<WebElement> ele = driver.findElements(By.xpath("//abbr"));
     ele.get(Integer.parseInt(month)-1).click();
//     List<WebElement> day = driver.findElements(By.xpath("//button[@class='react-calendar__tile react-calendar__month-view__days__day' or @class='react-calendar__tile react-calendar__month-view__days__day react-calendar__month-view__days__day--weekend']//abbr"));
//   ele.get(Integer.parseInt(days)-1).click();
     driver.findElement(By.xpath("//abbr[text()='"+days+"']")).click();    
}
}
