package generic;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FWutil {
	
	public static void getPhoto(WebDriver driver,String path)
	// create method to write screenshot code, so that we can reuse the the method
	{
	
	try
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
	File srcFile= ts.getScreenshotAs(OutputType.FILE);
	File desFile=new File(path);
	FileUtils.copyFile(srcFile, desFile);
	
	}
	catch(Exception e)
	{
		
	}
	
		
	}

}
