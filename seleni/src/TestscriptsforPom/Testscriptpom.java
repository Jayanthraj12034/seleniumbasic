package TestscriptsforPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.LoginPage;

public class Testscriptpom {
	
	@Test
	public void test1() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUsername("jayanthraj12034");
		Thread.sleep(2000);
		lp.setPassword("Titanic heroin nanna cheluve ");
		Thread.sleep(2000);
		lp.clickButton();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
		
	}	

}
