package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Uploadfile
{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("file:///C:/Users/JayanthRaj/Desktop/uploa.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("upload file")).sendKeys("C:\\Users\\JayanthRaj\\Desktop\\uploa.html");
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
