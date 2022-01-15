package Childbrowserpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchidofall {

	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/");
	Thread.sleep(8000);
	Set<String> allwh = driver.getWindowHandles();
	
	int count = allwh.size();
	System.out.println(count);
	
	for (String wh : allwh) {
		
		System.out.println(wh);
		
		
		
	}
	driver.quit();
	}
	
}
