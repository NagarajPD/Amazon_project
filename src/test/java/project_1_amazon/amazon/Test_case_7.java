package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(utility_test.class)
public class Test_case_7 extends Basee_class
{
	
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void test_casee_7()
	{
		Homepage_amazon home = new Homepage_amazon(driver);
		home.search_shoes_m();
		Product_page product = new Product_page(driver);
		product.product_list_m();
		
		Product_description_page product_description = new Product_description_page(driver);
		product_description.product_title_m();
		AssertJUnit.assertEquals(product_description.product_title.isDisplayed(), true);
		product_description.product_cost_m();
		AssertJUnit.assertEquals(product_description.product_cost.isDisplayed(), true);
		product_description.product_review_m();
		AssertJUnit.assertEquals(product_description.product_review.isDisplayed(), true);
				
	}

}
