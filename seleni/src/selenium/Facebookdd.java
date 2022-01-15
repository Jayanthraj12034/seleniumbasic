package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdd {
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/r.php?r=101");
		
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.id("month"));
		
		 
			
		Select s=new Select(ele);
		Thread.sleep(2000);
		
		s.selectByVisibleText("Jul");
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("day"));
		
		Select s1=new Select(ele1);
		Thread.sleep(2000);
		s1.selectByVisibleText("2");

		WebElement ele3 = driver.findElement(By.id("year"));
		
		Select s2=new Select(ele3);
		Thread.sleep(2000);
		s2.selectByVisibleText("1996");

		driver.findElement(By.xpath("//input[@type='radio']")).click();
	}

}
