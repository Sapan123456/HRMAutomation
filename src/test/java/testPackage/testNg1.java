package testPackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPackage.homepage;
import pomPackage.loginpage;

public class testNg1 {
	
	
	WebDriver driver;
	@Parameters({"browser"})
	
	
	@BeforeTest
	public void beforeTest(String browser)
	{
		if(browser.equals("chrome")) 
		{
			
			ChromeOptions option  = new ChromeOptions();
			
			option.addArguments("--remote-allow-origins=*");
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(option);
		}
		else if (browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		
		
		
		
		
		
	    driver.get("https://www.google.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
	
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class of class1");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		System.out.println("before method of class1");
	}
	
	@Test()
	public void Test1() throws Exception 
	{
		/*SoftAssert s = new SoftAssert(); 
		loginpage login=new loginpage(driver);
		login.sendusername("Admin");
		login.sendpassword("admin13");
		login.clickonloginsubmit();
		String ExpectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String ActualURL = driver.getCurrentUrl();
		Assert.assertEquals(ActualURL, ExpectedURL);
		
		homepage home = new  homepage (driver);
		boolean result = home.verifyadmin();
		s.assertTrue(result, "admin is present");
		System.out.println("admin is present");
		
		Thread.sleep(2000);
		boolean result1 = home.verifyPIM();
		s.assertTrue(result1, "PIM is present");
		System.out.println("PIM is present");
		Thread.sleep(2000);
		
		boolean result2 = home.verifyleave();
		s.assertTrue(result2, "Leave is present");
		System.out.println("Leave is present");
		Thread.sleep(2000);
		
		s.assertAll();
		
		
//		if (ExpectedURL.equals(ActualURL))
//		{
//			System.out.println("test case pass");
//		}
//		else
//		{
//			System.out.println("test case fail");
//		}
		
//		//hard assert
//		Assert.assertEquals(ActualURL, ExpectedURL);
//		Assert.assertNotEquals(null, null);
//		Assert.assertTrue(result);
//		Assert.assertFalse(false);
//		Assert.fail();
//		
//		//soft assert
//		
//		SoftAssert s = new SoftAssert(); 
//		s.assertEquals(false, false);
//		s.assertNotEquals(false, false);
//		s.assertTrue(false);
//		s.assertFalse(false);
//		s.assertAll();*/
		
		System.out.println("browser lunch");
		
		
		}
	
	@AfterMethod
	public void afterMethod() 
	{
		System.out.println("After method of class1");
	}
	
	@AfterClass
	public void afterClass() 
	{
		System.out.println("After class of class1");
	}
	
	@AfterTest
	public void aftertest()
	{
		//driver.quit();
	}
	
	
	

}
