package Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='4.1.1']")).click();
		Thread.sleep(3000);
		Robot rt=new Robot();
		rt.keyPress(KeyEvent.VK_LEFT);
		rt.keyRelease(KeyEvent.VK_LEFT);
		Thread.sleep(3000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
	}

}
