package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant  {
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);// chrome Key and chrome Value are constant which is mentiond in the IAutoConstant interface
	}
	 public WebDriver driver;//making driver as global variable and public access modifier bcz of screen shot i.e FWutil
	
	 @BeforeMethod

	public void openapplication()
	{
		driver = new ChromeDriver();//driver is global variabe, so we intaialised driver asd dchrome driver
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);//ITO are constant which is mentiond in the IAutoConstant
		driver.get(URL);//URL are constant which is mentiond in the IAutoConstant class
	}
	 
	@AfterMethod
	public void closeapplication (ITestResult testResults)
	{
		String name = testResults.getName();
		int status = testResults.getStatus();
		if(status==1)
		{
		Reporter.log(name+"is failed", true);
		String path= IMG_PATH+name+".png";
		FWutil.getPhoto(driver, path);
		}
		driver.close();
	}
}
	

