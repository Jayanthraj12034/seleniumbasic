package TestscriptsforPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.LoginpageYahoo;

public class YahooTest {
	@Test
	public void test1() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(2000);
		LoginpageYahoo lp=new LoginpageYahoo(driver);
		lp.clickbtnn();
		Thread.sleep(2000);
		lp.sendkeysss();
		Thread.sleep(2000);
		lp.nextBtnn();
		Thread.sleep(2000);
		lp.sendpasswordd();
		Thread.sleep(2000);
		lp.nextBtnn();
		
		
		
		
	}

}
