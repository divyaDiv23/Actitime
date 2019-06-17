package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.FWutil;
import generic.XL;

public class TestBaseTest extends BaseTest{
	
	@Test
	public void test()
	{
		
		try
		{
			int rc=XL.getRowCount(XL_PATH, "sheet1");
			Reporter.log("no of rows"+rc, true);
			String v = XL.getData(XL_PATH," sheet1", 0, 0);
			Reporter.log(v, true);
			Reporter.log("test", true);			
		}
		catch(Exception e)
		{
			
		}
		
		
		//FWutil.getPhoto(driver, "./screenshot/google.com"); it is removed beacaus it is uses itestresults
		Reporter.log("test", true);
		//Assert.fail();
	}

}
