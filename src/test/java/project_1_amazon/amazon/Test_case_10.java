package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility_test.class)
public class Test_case_10 extends Basee_class
{
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void testt_casee_10() throws InterruptedException
	{
		
		Homepage_amazon home = new Homepage_amazon(driver);
		
		
		home.search_shoes_m();
		Product_page product = new Product_page(driver);
		product.add_to_cart_button_m();
		product.add_to_cart_button_popup_m();
		driver.navigate().refresh();
		product.go_to_cart_m();
		Shopping_cart cart = new Shopping_cart(driver);
		cart.delete_item_m();
		
		
		//span[@data-a-selector='decrement-icon']
	}

}
