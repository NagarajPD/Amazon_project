package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility_test.class)
public class Test_case_14 extends Basee_class
{
	@Test(retryAnalyzer=Retry_logic.class)
	public void testt_casee_14()
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.sign_in_hover_over_m(driver);
		home.sign_in_m();
		
		Login_page login = new Login_page(driver);
		login.email_login_corrrect_m();
		login.proceed_to_create_m();
		login.password_correct_login_m();
		login.continue_to_home_page_login_m();
		home.orders_m();
		
		Your_orders orders = new Your_orders(driver);
		orders.review_m();
		orders.five_star_m();
	}

}
