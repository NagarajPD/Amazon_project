package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(utility_test.class)
public class Test_case_4 extends Basee_class
{
	
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void test_casee_4()
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.sign_in_hover_over_m(driver);
		home.sign_in_m();
		
		Login_page login = new Login_page(driver);
		login.email_login_corrrect_m();
		login.proceed_to_create_m();
		login.password_correct_login_m();
		login.continue_to_home_page_login_m();
		
		
		home.sign_in_hover_over_m(driver);
		home.manage_profile_m();
		home.view_profile_m();
		
		
		Profile_page profile = new Profile_page(driver);
		profile.name_preview_m();
		profile.edit_name_m();
		profile.continue_button_m();
		AssertJUnit.assertEquals(profile.your_profile_header.isDisplayed(), true);
		
		
		
	}
	

}
