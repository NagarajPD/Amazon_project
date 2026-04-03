package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility_test.class)
public class Test_case_9 extends Basee_class
{
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void testt_casee_9()
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.search_shoes_m();
		Product_page product = new Product_page(driver);
		product.add_to_cart_button_m();
		product.go_to_cart_m();
		//driver.navigate().back();
	//	home.search_bags_m();
		

}
}

