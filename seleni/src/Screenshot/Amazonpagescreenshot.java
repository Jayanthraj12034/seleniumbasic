package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazonpagescreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "./software/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File hdd=new File("C:\\Users\\JayanthRaj\\Desktop\\Screenshot\\amazon.jpeg");
		
		FileUtils.copyFile(temp, hdd);
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
	}

}
