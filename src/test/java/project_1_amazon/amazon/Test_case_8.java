package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utility_test.class)
public class Test_case_8 extends Basee_class
{

	@Test(retryAnalyzer=Retry_logic.class)
	public void testt_casee_8()
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.search_shoes_m();
		Product_page product = new Product_page(driver);
		product.price_drop_down_low_to_high_m();
		product.price_drop_down_high__to_low_m();
		product.price_drop_down_avg_rewiew_m();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		home.search_bags_m();
		product.price_drop_down_low_to_high_m();
		product.price_drop_down_high__to_low_m();
		product.price_drop_down_avg_rewiew_m();
	}
}
