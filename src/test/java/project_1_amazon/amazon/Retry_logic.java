package project_1_amazon.amazon;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer
{
	int initial_count =0;
	int retry_count=0;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(initial_count<retry_count) 
		{
			initial_count++;
			return true;
		}
		
		
		
		return false;
	}

}
