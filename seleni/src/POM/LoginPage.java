package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (id="email")
	private WebElement Untextbox;
	@FindBy (xpath="//input[@name='pass']")
	private WebElement pwdtextbox;
	@FindBy (xpath="//button[.='Log In']")
	private WebElement clickbtn;
	
	public LoginPage (WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void setUsername(String un)
	{
		Untextbox.sendKeys(un);
		
	}
	public void setPassword(String pwd){
		
		pwdtextbox.sendKeys(pwd);
		
	}
	public void clickButton(){
		
		clickbtn.click();
		
	}
}
