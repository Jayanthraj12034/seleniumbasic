package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
 		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gclid=EAIaIQobChMI2dmws9n29AIVAZNmAh3umgsvEAAYASAAEgJxH_D_BwE&gclsrc=aw.ds");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//button[@type='button']"));
		
		Thread.sleep(5000);
		
		String str="D:\\jayanth.doc";
		
		ele.sendKeys(str);
		
		
		
		
		
	}

}
