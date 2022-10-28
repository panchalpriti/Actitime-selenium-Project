package Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginp2 {
	
	@FindBy (id= "username")
	 private WebElement username;
	@FindBy (name="pwd")
	 private WebElement password;
	@FindBy (id="loginButton")
	 private WebElement loginbtn;
	
	Loginp2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setusername(String unr)
	{
		username.sendKeys(unr);
	}
	public void setpassword(String pwr)
	{
		password.sendKeys(pwr);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	}

