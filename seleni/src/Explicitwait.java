import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Shopping"));
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//div[.='Top Offers']")).click();
		wait.until(ExpectedConditions.urlContains("www.flipkart.com/offers-store?"));
		String titel1 = driver.getTitle();
		
		System.out.println(titel1);
		
		driver.quit();
		
		
		
		
	}
	

}
