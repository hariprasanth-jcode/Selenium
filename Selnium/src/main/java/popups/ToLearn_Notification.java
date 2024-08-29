package popups;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearn_Notification {
public static void main(String[] args) {
	//ChromeOptions settings=new ChromeOptions();
	//settings.addArguments("--disable-notifications");
	//ChromeDriver driver=new ChromeDriver(settings);//avoid
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));	
	driver.get("https://www.easemytrip.com/");
}
}
