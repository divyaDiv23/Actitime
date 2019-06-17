package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrack {

	
	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void verifyHomePageIsDisplayed(WebDriver driver,long eto)//int long changed , bcz in testvaliligin page it is taken ecplicit one, in order match long we changed here
	{
	
	WebDriverWait wait = new WebDriverWait(driver,  eto);
	try
	{
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	Reporter.log("homepage is displaying");
	}
	catch(Exception e)
	{
		Reporter.log("homepage is not displaying");
		}
	}
}
