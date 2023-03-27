package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Admin;
import POM.Homepage;
import POM.Leave;
import POM.PIM;
import POM.Time;
import POM.loginpage;

public class test1 {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
			//1
		loginpage login=new loginpage(driver);
		login.sendusername("Admin");
		login.sendpassword("admin123");
		login.clickonloginsubmit();
		
		Thread.sleep(10000);
		
		//2
		Admin admin = new Admin(driver);
		admin.clickonadminbutton();
		Thread.sleep(3000);
		admin.isdisplayedusermanagement();
		Thread.sleep(3000);
		admin.isdisplayedjob();
		Thread.sleep(2000);
		
		//3
		PIM pim = new PIM(driver);
		pim.clickonPIMbutton();
		Thread.sleep(3000);
		pim.emp_listCLICK();
		Thread.sleep(3000);
		pim.emp_namesend("saurav");
		
		//4
		Leave leave = new Leave(driver);
		leave.clickonLeavebutton();
		Thread.sleep(3000);
		leave.emp_nameesend("saurav");
		
		//5
		Time time = new Time(driver);
		time.clickonTimebutton();
		Thread.sleep(3000);
		time.emp_namesend("saurav");
		
		
		
	}

}
