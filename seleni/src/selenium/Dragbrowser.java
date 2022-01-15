package selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dragbrowser {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		Point p=new Point(500, 600);
		driver.manage().window().setPosition(p);
	}

}
