package Actitime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class HomepageD2 extends Base {
 
 static
 {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
 
@Test
	public void user() throws InterruptedException {
	
	  HomeP2 h= new HomeP2(driver);
	  h.Home();
	  Thread.sleep(2000);
	  h.fillinfo();
	  h.selectdept();
	  h.cancelbtn();
	  Alert a= driver.switchTo().alert();
	  a.accept();
	  
  }
}
