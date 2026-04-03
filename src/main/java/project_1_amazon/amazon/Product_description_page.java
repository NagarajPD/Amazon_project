package project_1_amazon.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_description_page extends utility_src
{

	@FindBy(xpath="//span[@id='productTitle']")
	WebElement product_title;
	
	@FindBy(xpath="//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")
	WebElement product_cost;
	
	
	@FindBy(xpath="//h2[@id='averageCustomerReviewsAnchor']")
	WebElement product_review;
	
	
	
	
	public void product_title_m()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(product_title));		
	}
	public void product_cost_m()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(product_cost));		
	}
	public void product_review_m()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(product_review));				
	}
	
	
	
	
	
	
	
	
	
	
	public Product_description_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
}
