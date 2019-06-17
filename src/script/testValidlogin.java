package script;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.XL;
import page.EnterTimeTrack;
import page.LoginPage;

public class testValidlogin extends BaseTest {
	@Test
	public void login() throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		String un = XL.getData(XL_PATH, "sheet1",1, 0);
		String pw = XL.getData(XL_PATH, "sheet1",1, 1);
		
		LoginPage lp = new LoginPage(driver);// alla the data in login page, so we are create object
		lp.setUsername(un);
		lp.setpassword(pw);
		lp.ClickLogin();
		
		EnterTimeTrack etp =  new EnterTimeTrack(driver);
		etp.verifyHomePageIsDisplayed(driver, ETO);
		
	}

}
