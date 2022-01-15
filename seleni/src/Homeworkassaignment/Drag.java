package Homeworkassaignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drag {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	
	driver.get("https://www.selenium.dev/downloads/");
	
	 WebElement ele = driver.findElement(By.xpath("//a[.='4.1.1']"));
	
	 Point fl = ele.getLocation();
	 
	 System.out.println(fl);
	 
	int h = fl.getX();
			System.out.println(h);
	
	 
	 
	Thread.sleep(3000);
	
	
	
}
}
