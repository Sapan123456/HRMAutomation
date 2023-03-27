package pomPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Admin {
	//data members (variables)
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath="//span[text()='User Management ']")
	private WebElement usermanagement;
	
	@FindBy(xpath="//span[text()='Job ']")
	private WebElement job;
	//constructor
	public Admin(WebDriver driver) {
	PageFactory.initElements(driver, this);}
	//method
	public void clickonadminbutton() {
	  admin.click();}
	public void isdisplayedusermanagement() 
	{
	  boolean text1=usermanagement.isDisplayed();
	  if(text1==true) 
	  {System.out.println("usermanagement button is displaying");
	  }
	  else 
	  {System.out.println("usermanagement button is not displaying");
	  }
	}
	public void isdisplayedjob() 
	{
	  boolean text2=job.isDisplayed();
	  if(text2==true) 
	  {System.out.println("job button is displaying");
	  }
	  else 
	  {System.out.println("job button is not displaying");
	  }
	 }
	

}
