package TestscriptsforPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM.LogintoGmail;

public class Gamiltest {
	@Test
	
	public void Gmaillog(){
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	LogintoGmail lg=new LogintoGmail(driver);
	lg.usnname();
	lg.nextbutn();
	
	}

}
