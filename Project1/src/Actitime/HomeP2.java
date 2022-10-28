package Actitime;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeP2 {
	
	
	@FindBy (xpath = "(//div[.='Users'])[1]")
	private WebElement user;
	@FindBy (xpath="//div[.='New User']")
	private WebElement newuser;
	@FindBy (id="createUserPanel_firstNameField")
	private WebElement firstname;
	@FindBy (id="createUserPanel_lastNameField")
	private WebElement lastname;
	@FindBy (id="createUserPanel_emailField")
	private WebElement email;
	@FindBy (xpath = "(//div[.='-- department not assigned --'])[1]")
	private WebElement department;
	@FindBy (css = "div[class='item selected']")
	private WebElement qualitycontrol;
	@FindBy (xpath="//div[@class='components_button cancelBtn']")
	private WebElement cancelbtn;
	
	public HomeP2(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	 public void Home() throws InterruptedException
	 {
		
		 user.click();
		 Thread.sleep(2000);
		 newuser.click();
		 Thread.sleep(2000);
	 }
	 public void fillinfo() throws InterruptedException
	 {
		 
		 firstname.sendKeys("Priti");
		 lastname.sendKeys("panchal");
		 email.sendKeys("panchal*r**i142@gmail.com");
	 }
	 public void selectdept()
	 {
		 department.click();
		 qualitycontrol.click();
	 }
	 public void cancelbtn()
	 {
		 cancelbtn.click();
	 }

}
