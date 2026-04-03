package project_1_amazon.amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class utility_test extends Basee_class implements ITestListener
{
	

	Date d1 = new Date();
	Date d2 = new Date(d1.getTime());
	String d3 =d2.toString();
	String year =d3.substring(24);
	String month =d3.substring(4,7);
	String date =d3.substring(8,10);
	String day =d3.substring(0,3);
	String hour =d3.substring(11,13);
	String min =d3.substring(14,16);
	String sec =d3.substring(17,19);
	/*System.out.println(year);
	System.out.println(month);
	System.out.println(date);
	System.out.println(day);
	System.out.println(hour);
	System.out.println(min);
	System.out.println(sec);*/
	String date1 = date.concat("_").concat(month).concat("_").concat(year).concat("||").concat(hour).concat(":").concat(min).concat(":").concat(sec).concat("(").concat(day).concat(")"); 
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File Dist = new File("/Users/nagaraj.pd/Downloads/eclipse-workspace 3/projects/amazon/src/test/java/project_1_amazon/Screenshots/pass/"+date1+".png");
		try {
			FileHandler.copy(source, Dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source =ts.getScreenshotAs(OutputType.FILE);
		File dist = new File ("/Users/nagaraj.pd/Downloads/eclipse-workspace 3/projects/amazon/src/test/java/project_1_amazon/Screenshots/fail/"+date1+".png");
		try {
			FileHandler.copy(Source, dist);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Object[][] data_fetching() throws EncryptedDocumentException, IOException
	{
		Object[][] o1 = new Object[1][1];
		FileInputStream f1 = new FileInputStream("/home/nagaraj.pd/eclipse-workspace/projects/amazon/data_fetching/data_fetching.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String username = w1.getSheet("username").getRow(0).getCell(0).getStringCellValue();
		
		
		return o1;
		
		
		
		
		
				}
	
}
