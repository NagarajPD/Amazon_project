package project_1_amazon.amazon;


import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(utility_test.class)
public class Test_case_1 extends Basee_class
{
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void Test_casee_1() throws EncryptedDocumentException, IOException
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.sign_in_hover_over_m(driver);
		home.start_here_m();
		
		
		
		Login_page login = new Login_page(driver);
		login.email_m();
		login.continue_email_m();
		login.proceed_to_create_m();
		login.cell_number_m();
		login.name_m();
		login.password_m();
		login.verify_mobile_number_m();
		
		
		Captcha_page captcha = new Captcha_page(driver);
		captcha.puzzle_m();		
		
		
		
	}

}
