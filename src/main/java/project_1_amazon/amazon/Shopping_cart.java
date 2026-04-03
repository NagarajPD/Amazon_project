package project_1_amazon.amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping_cart extends utility_src
{
	@FindBy(xpath="//span[@data-a-selector='decrement-icon']")
	WebElement delete_item;
	
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement proceed_to_buy;
	
	
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	WebElement Amazon_pay_balance;
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	WebElement Amazon_pay;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	WebElement card;
	
	@FindBy(xpath="(//input[@type='radio'])[4]")
	WebElement netbanking;
	
	@FindBy(xpath="(//input[@type='radio'])[5]")
	WebElement scan_and_pay;
	
	@FindBy(xpath="(//input[@type='radio'])[6]")
	WebElement other_upi;
	
	@FindBy(xpath="(//input[@type='radio'])[8]")
	WebElement cash_on_dilevery;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[1]")
	WebElement use_this_payment_method;
	
	@FindBy(xpath="//h2[@id='deliver-to-customer-text']")
	WebElement delivery_address_present;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement enter_coupon;
	
	
	
	public void delete_item_m()
	{
		delete_item.click();
	}	
	public void proceed_to_buy_m()
	{
		proceed_to_buy.click();
	}	
	public void Amazon_pay_balance_m()
	{
		Amazon_pay_balance.click();
	}
	public void Amazon_pay_m()
	{
		Amazon_pay.click();
	}
	public void card_m()
	{
		card.click();
	}
	public void netbanking_m()
	{
		netbanking.click();
	}
	public void scan_and_pay_m()
	{
		scan_and_pay.click();
	}
	public void other_upi_m()
	{
		other_upi.click();
	}
	public void cash_on_dilevery_m()
	{
		cash_on_dilevery.click();
	}
	public void enter_coupon_m()
	{
		enter_coupon.sendKeys("123456");
	}
	
	
	
	
	
	
	
	
	
	public void use_this_payment_method_m() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='checkout-secondary-continue-button-id-announce']")));
		Thread.sleep(2000);
		use_this_payment_method.click();
	}
	public void delivery_address_present_m()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(delivery_address_present));
	}
	
	
	
	
	
	

	public Shopping_cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
}
