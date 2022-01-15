package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogintoGmail {
	
	@FindBy (xpath="//input[@id='identifierId']")
	private WebElement emailtxtfld;
	
	@FindBy (xpath="//span[@class='VfPpkd-vQzf8d']")
	private WebElement nextbtn;
	
	
	public  LogintoGmail (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}

	
	public void usnname(){
		emailtxtfld.sendKeys("jayanthraj12034@gmail.com");
	}
	public void nextbutn(){
		nextbtn.click();
	}
}
