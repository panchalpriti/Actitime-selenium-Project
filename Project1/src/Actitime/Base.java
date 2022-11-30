package Actitime;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base {
	 WebDriver driver=null;
	 
	 static 
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	 
	 @BeforeTest
	public void Openbrowser()
	{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Reporter.log("Browser Opened",true);
	}
	 
	 @BeforeMethod
	 public void login() throws InterruptedException
	 {
		 driver.get("https://demo.actitime.com/login.do");
		 Loginp1 p2 =new Loginp1(driver);
		 p2.setusername("admin");
		 p2.setpassword("manager");
		 p2.clickloginbtn();
		 Thread.sleep(5000);
		 Reporter.log("Login",true);
	 }
	 
	 @AfterMethod
	 public void logout()
	 {
		Loginp1 p2 = new Loginp1(driver);
		p2.clicklogout();
		Reporter.log("Logout",true);
	 }
	 
	@AfterTest
	public void closebrowser() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.close();
	Reporter.log("Browser Closed",true);
	}
	
	
}
