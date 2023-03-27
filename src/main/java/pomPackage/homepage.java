package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	
	//data members (variables)
			@FindBy(xpath="//span[text()='Admin']")
			private WebElement Admin;
			@FindBy(xpath="//span[text()='PIM']")
			private WebElement PIM;
			@FindBy(xpath="//span[text()='Leave']")
			private WebElement Leave;
			
			//constructor
			public homepage(WebDriver driver) {
			PageFactory.initElements(driver, this);}
			
			
			//method
			public boolean verifyadmin() throws Exception
			{
				Thread.sleep(2000);
				boolean result = Admin.isDisplayed();
				return result;
			}
			public boolean verifyPIM() throws Exception 
			{
				Thread.sleep(2000);
				boolean result1 = PIM.isDisplayed();
				return result1;
			}
			public boolean verifyleave() throws Exception 
			{
				Thread.sleep(2000);
				boolean result3 = Leave.isDisplayed();
				return result3;
			}

}
