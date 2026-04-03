package project_1_amazon.amazon;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;

public class utility_src  
{
	public String username;
	
	
	WebDriver driver;
	
	public Object[][] excelsheet() throws EncryptedDocumentException, IOException
	{
		Object o1[][] = new Object[1][1];
		FileInputStream f1 = new FileInputStream("/home/nagaraj.pd/eclipse-workspace/projects/amazon/data_fetching/data_fetching.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		username= w1.getSheet("username").getRow(1).getCell(0).getStringCellValue();
		return o1;
		
		
		
		
	}

}
