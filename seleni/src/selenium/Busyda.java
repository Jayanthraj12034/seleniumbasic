package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Busyda {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.irctc.com");
		
		WebElement ele = driver.findElement(By.xpath("//select[@clas='goog-te-combo']"));
		
		Select s=new Select(ele);
		s.deselectByIndex(1);
		
		
	}

}
