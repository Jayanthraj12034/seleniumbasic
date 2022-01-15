package Homeworkassaignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popups {
public static void main(String[] args) throws InterruptedException, AWTException {
	
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.selenium.dev/downloads/");
	
	driver.findElement(By.xpath("//a[.='4.1.1']")).click();
	
	Thread.sleep(3000);
	
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_LEFT);
	r.keyRelease(KeyEvent.VK_LEFT);
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	

	

	
	
}
}
