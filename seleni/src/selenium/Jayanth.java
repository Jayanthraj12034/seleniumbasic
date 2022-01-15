package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jayanth {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.chrome.driver";
		String value="./Software/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("4644664dgdhdhfdhfhfh");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("4674646");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[value='1']")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
				

	}

}
