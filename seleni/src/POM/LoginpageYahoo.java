package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpageYahoo {
		
		@FindBy(xpath="(//div[.='Sign In'])[2]")
		private WebElement signin;
		
		@FindBy(xpath="//input[@id='login-username']")
		private WebElement textfield;
		@FindBy (xpath="//input[@type='submit']")
		private WebElement BTn;
		@FindBy (xpath="//input[@id='login-passwd']")
		private WebElement passtxtfield;
		@FindBy (xpath="//button[@type='submit']")
		private WebElement nextbtn;
		
		
		
		
		public  LoginpageYahoo (WebDriver driver){
			PageFactory.initElements(driver, this);
			
		}
		public void clickbtnn(){
			signin.click();
	}
		public void sendkeysss(){
			textfield.sendKeys("jayanthrajanna1996@yahoo.com");
		}
	public void nextBtnn(){
		BTn.click();
	}
	public void sendpasswordd(){
		passtxtfield.sendKeys("Sharadamma@1498");
	}
		
		public void nextbttn(){
			nextbtn.click();
		}
	
	
}
