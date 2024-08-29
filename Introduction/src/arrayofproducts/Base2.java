package arrayofproducts;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/gift-cards");
	String[] price= {"$25","$100"};
	List<String> productprice = Arrays.asList(price);
	List<WebElement> products = driver.findElements(By.cssSelector("h2[class='product-title']"));
    for(int i=0;i<products.size();i++) {
    	String[] gift=products.get(i).getText().split(" ");
    	String res = gift[0].trim();    	
    	if(productprice.contains(res)) {
    		products.get(i).findElement(By.xpath("//input[value='Add to cart']")).click();
    }
   
    }
}
}
