package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maximize {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
	}

}
