package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomeP2 {
	
	
	@FindBy (id="container_users")
	private WebElement user;
	@FindBy (xpath="//div[.='New User']")
	private WebElement newuser;
	@FindBy (name="firstName")
	private WebElement firstname;
	@FindBy (name="lastName")
	private WebElement lastname;
	@FindBy (name="email")
	private WebElement email;
	@FindBy (xpath="//div[contains(@class,'simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty')]")
	private WebElement department;
	@FindBy ()
	private WebElement cancelbtn;
	
	HomeP2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 public void Home() throws InterruptedException
	 {
		 user.click();
		 Thread.sleep(2000);
		 newuser.click();
	 }
	 public void fillinfo()
	 {
		 firstname.sendKeys("Priti");
		 lastname.sendKeys("panchal");
		 email.sendKeys("panchal*r**i142@gmail.com");
	 }
	 public void selectdept()
	 {
		 Select s= new Select(department);
		 s.selectByVisibleText("Quality Control");
	 }
	 public void cancelbtn()
	 {
		 cancelbtn.click();
	 }

}
