package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenpopup {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/?utm_source=google&utm_medium=cpc&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMIuvCslKH09AIVHZNmAh2IPw1ZEAAYASAAEgIewfD_BwE&gclid=EAIaIQobChMIuvCslKH09AIVHZNmAh2IPw1ZEAAYASAAEgIewfD_BwE");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@style='min-width: 185px;']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[.='4'])[5]")).click();
		Thread.sleep(3000);
		driver.close();
		
		
		
	}

}
