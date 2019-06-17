package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement UnTb;
	
	@FindBy(name="pwd")
	private WebElement PwTb;
	
	@FindBy(xpath="//div[.='Login ')]")
	
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,  this);
	}
	public void setUsername(String un)
	{
		UnTb.sendKeys(un);
	}
	public void setpassword(String pw)
	{
		PwTb.sendKeys(pw);
	}
	public void ClickLogin()
	{
		UnTb.click();
	}
	
	

}
