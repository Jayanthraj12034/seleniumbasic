package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4 {
	//drag and drop

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		
 		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(3000);
		
		WebElement b1 = driver.findElement(By.id("box3"));
		
		WebElement b2 = driver.findElement(By.id("box103"));
		
		WebElement b3 = driver.findElement(By.id("box5"));
		
		WebElement b4 = driver.findElement(By.id("box105"));
		
		WebElement b5 = driver.findElement(By.id("box4"));
		
		WebElement b6 = driver.findElement(By.id("box107"));
		
		WebElement b7 = driver.findElement(By.id("box6"));
		
		WebElement b8 = driver.findElement(By.id("box106"));
		
		WebElement b9 = driver.findElement(By.id("box7"));
		
		WebElement b10	 = driver.findElement(By.id("box101"));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(b1, b2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(b3, b4).perform();
		
		Thread.sleep(2000);
		act.dragAndDrop(b5, b6).perform();
		Thread.sleep(2000);
		act.dragAndDrop(b7, b8).perform();
		Thread.sleep(2000);
		act.dragAndDrop(b9, b10).perform();
		
		String sd = b1.getCssValue("background-color");
		System.out.println(sd);
		if(sd.contains("255")){
		System.out.println("backround colour is green");
		}
		else{
			System.out.println("background  colur is not gtreen");
		}
	}
	
	
	
	
}
