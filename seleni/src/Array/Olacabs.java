package Array;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Olacabs {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.olacabs.com/");

		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='addressInput']")).sendKeys("qspiders rajaji nagar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='middle h-full text placeholder']")).sendKeys("tumakuru");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='ow-button ow-button--secondary']")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		
	}

}
