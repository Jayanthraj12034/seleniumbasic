package Childbrowserpopups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchid {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		
		String p_id = driver.getWindowHandle();
		System.out.println(p_id);
		
		
	}

}
