import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Implictwait {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[.='✕']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Samasungf12");
		
		driver.findElement(By.xpath("//div[.='Top Offers']")).click();
		
		
		driver.findElement(By.xpath("//a[.='Flights']")).click();
		
		driver.navigate().back();
		
		
	}
}
