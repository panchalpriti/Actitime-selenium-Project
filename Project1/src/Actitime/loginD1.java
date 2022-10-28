package Actitime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginD1 {
	WebDriver driver;

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeMethod
	public void Openbrowser()
	{
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	}

		@Test (priority = 1)
		public void loginadmini() throws InterruptedException, EncryptedDocumentException, FileNotFoundException, IOException
		{
			
		driver.get("https://demo.actitime.com/login.do");
		
		Loginp1 p= new Loginp1(driver);
		String exlpath="./Data/inputs1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(exlpath));
		
		for(int a=3; a<=6; a++)
		{
			String un = wb.getSheet("administrator").getRow(a).getCell(0).toString();
			
			String pw = wb.getSheet("administrator").getRow(a).getCell(1).toString();
			p.setusername(un);
			p.setpassword(pw);
			p.clickloginbtn();
			Thread.sleep(2000);
		}
		}
		
		@Test (priority = 2)
		public void loginregular() throws EncryptedDocumentException, FileNotFoundException, IOException, InterruptedException
		{
		driver.get("https://demo.actitime.com/login.do");
		
		Loginp2 p2= new Loginp2(driver);
		String exlpath="./Data/inputs1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(exlpath));
		
		for(int a=3; a<=6; a++)
		{
			String unr = wb.getSheet("Regular").getRow(a).getCell(0).toString();
			
			String pwr = wb.getSheet("Regular").getRow(a).getCell(1).toString();
			p2.setusername(unr);
			p2.setpassword(pwr);
			p2.clickloginbtn();
			Thread.sleep(2000);
		}
		
		}
		@AfterMethod
		public void closebrowser() throws InterruptedException
		{
		Thread.sleep(2000);
		driver.close();
		
		
				
		
	}

}
