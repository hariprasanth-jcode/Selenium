package dropdown;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadPopUp {
@Test
public void main() throws AWTException, InterruptedException {
	
 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.id("pickfiles")).click();
	Robot robot = new Robot();

    // Define the file path you want to upload
	Thread.sleep(5000);
    String filePath = "C:\\Users\\QSP-USER\\Collection.pdf";
    Thread.sleep(2000);
    StringSelection stringSelection = new StringSelection(filePath);
    Thread.sleep(2000);
    Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
    Thread.sleep(2000);
    clip.setContents(stringSelection, null);
    Thread.sleep(2000);
  System.out.println(driver.getCurrentUrl());

    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
