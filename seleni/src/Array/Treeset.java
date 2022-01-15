package Array;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Treeset {
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/r.php?r=101");
		
			 WebElement ele = driver.findElement(By.id("month"));
			 Select s=new Select(ele);
			 List<WebElement> options = s.getOptions();
			 TreeSet<String> ts=new TreeSet<String>();
			 
			 for (WebElement option : options) {
				
				 String text = option.getText();
				 ts.add(text);
				 
			}
			for (String t : ts) {
				System.out.println(t);
				
			} 
	}

}
