package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//button[.='✕']")).click();
		 Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//div[.='Electronics']"));
		Actions act =new Actions(driver);
		act.moveToElement(ele);
		 Thread.sleep(2000);
		
		 ele.click();
		 
		
		
		
		
	}

}
