package Childbrowserpopups;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fetchandquitchildbrowsers {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Thread.sleep(8000);
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		allwh.remove(p_id);
		
		int count = allwh.size();
		System.out.println(count);
		
		for (String wh : allwh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
			
			
		}
		
		

		
		
		
		
		
	}
	
	

}
