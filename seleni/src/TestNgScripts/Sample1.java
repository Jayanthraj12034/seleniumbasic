package TestNgScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generics.GenericClass;

public class Sample1 extends GenericClass {
	@Test
	public void test1() throws InterruptedException{
		driver.get("https://facebook.com/");
		driver.findElement(By.id("email")).sendKeys("madhukargowdruu");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123456789nelevjvj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Log In']")).click();
		
		
		}
}
