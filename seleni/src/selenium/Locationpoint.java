package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locationpoint {
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.navigate().to("https://www.facebook.com/");

	
	WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));

	Point loc = ele.getLocation();
	
	System.out.println(loc);
	
	int x = loc.getX();
	System.out.println(x);
	
	int y = loc.getY();
	System.out.println(y);
}
}
