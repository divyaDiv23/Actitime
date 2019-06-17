package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {

	public static int getRowCount(String path, String sheet)
	{
		int rc=0;
		try
		{
			rc=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getLastRowNum();
			
		}
		catch(Exception e)
		{
			
		}
		return rc;
		
	}
	public static String getData(String path,String sheet,int r, int c) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb= WorkbookFactory.create(new FileInputStream(path));
		String v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		return v;
		
	}
}
