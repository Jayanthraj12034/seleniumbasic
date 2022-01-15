package Homeworkassaignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Work {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		int count = links.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++){
			
			WebElement w = links.get(i);
			
			String text = w.getText();
			System.out.println(text);
		}
		
		
		
		
		
	}

}
