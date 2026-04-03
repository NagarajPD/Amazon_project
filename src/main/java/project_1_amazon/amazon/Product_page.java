package project_1_amazon.amazon;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_page extends utility_src

{
	@FindBy(xpath="//h2[.='Results']")
	WebElement result_visible;
	
	@FindBy(xpath="//select[@name='s']")
	WebElement price_drop_down;
	
	@FindBy(xpath="//div[@class='a-section aok-relative s-image-tall-aspect']")
	List<WebElement> product_list;
	
	@FindBy(xpath="//button[.='Add to cart']")
	List<WebElement> add_to_cart_button;
	
	@FindBy(xpath="//div[@class='a-popover-inner']//div[@data-csa-c-content-id='puis-atc-size-variation']//button[@aria-label='Add to cart']")
	WebElement add_to_cart_button_popup;
	
	//div/div/div/div/div/div/div/div/div/span/div/span/span/button[@class='a-button-text']
	@FindBy(xpath="//a[@href='/cart?ref_=ox_ewc_ret_gtc_dsk_in']")
	WebElement go_to_cart;
	
	
	public void result_visible_m()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(result_visible));
	}
	
	public void price_drop_down_low_to_high_m()
	{
		Select s1 = new Select(price_drop_down);
		s1.selectByIndex(1);
	}
	public void price_drop_down_high__to_low_m()
	{
		Select s1 = new Select(price_drop_down);
		s1.selectByIndex(2);
	}
	
	public void price_drop_down_avg_rewiew_m()
	{
		Select s1 = new Select(price_drop_down);
		s1.selectByIndex(3);
	}
	public void product_list_m()
	{
		product_list.get(5).click();
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> i1 = handles.iterator();
		
		String parent = i1.next();
		
		String child = i1.next();
		
		driver.switchTo().window(child);
	}
	
	public void add_to_cart_button_m()
	{
		add_to_cart_button.get(1).click();
	}
	
	public void add_to_cart_button_popup_m() throws InterruptedException
	{
		add_to_cart_button_popup.click();
		Thread.sleep(2000);
	}
	
	public void go_to_cart_m()
	{
		go_to_cart.click();
	}
	
	
	
	
	
	
	public Product_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
