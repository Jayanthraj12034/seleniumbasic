package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Listarray {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/r.php?r=101");
		
			 WebElement ele = driver.findElement(By.id("month"));
			 Select s=new Select(ele);
			 List<WebElement> options = s.getOptions();
			 ArrayList<String> arr=new ArrayList<String>();
			 
			 for (WebElement option : options) {
				String text = option.getText();
				arr.add(text);
				
			}
			 
			Collections.sort(arr);
			for (String t : arr) {
				System.out.println(t);
				
			}
		
		
	}

}
