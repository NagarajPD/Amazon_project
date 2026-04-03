package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility_test.class)
public class Test_case_3 extends Basee_class
{
	
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void test_casee_3()
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.sign_in_hover_over_m(driver);
		home.sign_in_m();
		
		Login_page login = new Login_page(driver);
		login.email_login_wrong_m();
		login.continue_email_m();
		login.password_wrong_login_m();
		login.continue_to_home_page_login__without_wait_m();
		
	}

}
