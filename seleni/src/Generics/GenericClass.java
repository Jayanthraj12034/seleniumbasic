package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericClass {
	 public WebDriver driver;
	@BeforeMethod
	
	public void launchBrowser(){
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		 driver=new FirefoxDriver();
		
	}

	@AfterMethod
	public void closeBrowser(){
		
		driver.close();
	}
	
}
