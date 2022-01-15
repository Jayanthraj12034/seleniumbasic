package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flippyyy {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		
		System.out.println(links.size());
		
		for (WebElement link : links) {
			
			String l = link.getText();
			System.out.println(l);
			
		}
		
		Thread.sleep(2000);
		driver.close();

	}

}
