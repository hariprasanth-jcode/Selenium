package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro {
    //Invoking browser
    //Chrome ---> Chrome Driver Methods
	//FireFox--->FireFoxDriver close get
	//saafari saariDriver-->Method close get
	//WebDriver closet get
	//WebDriver methods + class Methods
	//chromedriver.exe-->Chrome browserr
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		
		//FirefoxDriver
		//geckodriver
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		//Microsoft edge
		System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();
		driver.quit();
	}
}
