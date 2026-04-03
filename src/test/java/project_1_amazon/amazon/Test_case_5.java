package project_1_amazon.amazon;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(utility_test.class)
public class Test_case_5 extends Basee_class
{
	
	
	
	@Test(retryAnalyzer=Retry_logic.class)
	public void test_casee_5() {
		
	
	Homepage_amazon home = new Homepage_amazon(driver);
	home.search_shoes_m();
	Product_page product = new Product_page(driver);
	AssertJUnit.assertEquals(product.result_visible.isDisplayed(), true);
	driver.navigate().back();
	home.search_bags_m();
	AssertJUnit.assertEquals(product.result_visible.isDisplayed(), true);
	
	
	}
	

}
