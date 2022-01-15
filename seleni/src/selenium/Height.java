package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Height {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.navigate().to("https://www.facebook.com/");
	
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		int h = ele.getSize().getHeight();
		System.out.println(h);
		int w = ele.getSize().getWidth();
		System.out.println(w);
		
		String font = ele.getCssValue("font-size");
		System.out.println(font);
		
		
	}
}
