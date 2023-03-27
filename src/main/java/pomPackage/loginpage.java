package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	
	//data members (variables)
		@FindBy(xpath="//input[contains(@name,'username')]")
		private WebElement username;
		@FindBy(xpath="//input[contains(@name,'password')]")
		private WebElement password;
		@FindBy(xpath="//button[contains(@type,'submit')]")
		private WebElement submit;
		
		//constructor
		public loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);}
		
		
		//method
		public void sendusername(String uname) {
		username.sendKeys(uname);}
		public void sendpassword(String pwd) {
		password.sendKeys(pwd);}
		public void clickonloginsubmit() {
		submit.click();
		}
		
	

}
