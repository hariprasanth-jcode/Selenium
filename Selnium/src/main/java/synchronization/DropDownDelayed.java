package synchronization;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DropDownDelayed {
    public static void main(String[] args) {
        // Initialize WebDriver and navigate to the page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        
        // Find the 'Dropdown' button
        WebElement ele1 = driver.findElement(By.xpath("//button[text()='Dropdown']"));
        
        // Scroll to the 'Dropdown' button and adjust the scroll position
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", ele1);
        js.executeScript("window.scrollBy(0, -200);");
        
        // Click on the 'Dropdown' button
        ele1.click();
        
        // Find all elements within the dropdown
        List<WebElement> ele = driver.findElements(By.xpath("//div[@class='dropdown']/div/a"));
        
        // Look for the Facebook link
        WebElement facebookLink = null;
        for (WebElement element : ele) {
            if (element.getText().contains("Facebook")) {
                facebookLink = element;
                break;
            }
        }
        
        if (facebookLink != null) {
            System.out.println("Facebook link is found.");
            
            // Scroll to the Facebook link
            js.executeScript("arguments[0].scrollIntoView(true);", facebookLink);
            
            // Wait for the Facebook link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(facebookLink));
            
            // Attempt to click the Facebook link
            try {
                facebookLink.click();
            } catch (Exception e) {
                js.executeScript("arguments[0].click();", facebookLink);
            }
            
            System.out.println("Clicked on the Facebook link.");
        } else {
            System.out.println("Facebook link is not found.");
        }
        
        // Clean up
        driver.quit();
    }
}
