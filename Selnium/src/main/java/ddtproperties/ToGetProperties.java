package ddtproperties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToGetProperties {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./DDT/properties_example.properties");
	Properties p=new Properties();
	p.load(fis);
	String url = p.getProperty("url");
	System.out.println(url);
	WebDriver driver = new ChromeDriver();
	driver.get(url);
	

		    
}
}
