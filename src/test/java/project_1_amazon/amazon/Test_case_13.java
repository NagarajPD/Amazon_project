package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility_test.class)
public class Test_case_13 extends Basee_class
{
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void Test_casee_13() throws InterruptedException
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.sign_in_hover_over_m(driver);
		home.sign_in_m();
		
		Login_page login = new Login_page(driver);
		login.email_login_corrrect_m();
		login.proceed_to_create_m();
		login.password_correct_login_m();
		login.continue_to_home_page_login_m();
		
		home.search_shoes_m();
		Product_page product = new Product_page(driver);
		product.add_to_cart_button_m();
		product.add_to_cart_button_popup_m();
		driver.navigate().refresh();
		product.go_to_cart_m();
		Shopping_cart cart = new Shopping_cart(driver);
		cart.proceed_to_buy_m();
	
		cart.Amazon_pay_balance_m();
		cart.enter_coupon_m();
		
	}

}
