package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		WebElement element = driver.findElement(By.id("multiselect1"));
		Select ele = new Select(element);
		ele.selectByIndex(1);
		System.out.println(ele.getAllSelectedOptions().size());
		ele.selectByValue("Hyundaix");
		ele.selectByVisibleText("Volvo");
		System.out.println(ele.getAllSelectedOptions().size());
		System.out.println(ele.isMultiple());
		ele.deselectByIndex(2);
		System.out.println(ele.getAllSelectedOptions().size());
		ele.deselectAll();
		Thread.sleep(4000);
		System.out.println(ele.isMultiple());

	}
}
