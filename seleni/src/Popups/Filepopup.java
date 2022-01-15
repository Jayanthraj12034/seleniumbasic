package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filepopup {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("jayanthraj");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);
	Alert at = driver.switchTo().alert();
	String text = at.getText();
	System.out.println(text);
	at.accept();
	Thread.sleep(2000);
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);

	driver.close();
	

	
	
	
	
}
}
