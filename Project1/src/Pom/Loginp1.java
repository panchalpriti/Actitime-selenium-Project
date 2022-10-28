package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginp1 {
	@FindBy (id= "username")
	 private WebElement username;
	@FindBy (name="pwd")
	 private WebElement password;
	@FindBy (id="loginButton")
	 private WebElement loginbtn;
	@FindBy (id="logoutLink")
	private WebElement logout;
	
	Loginp1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setusername(String un)
	{
		username.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		password.sendKeys(pw);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	public void clicklogout()
	{
		logout.click();
	}
	}


