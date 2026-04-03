package project_1_amazon.amazon;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Your_orders extends utility_src
{
	@FindBy(xpath="//span[@id='a-autoid-7']")
	WebElement review;
	
	@FindBy(xpath="//img[@alt='select to rate item five star.']")
	List<WebElement> five_star;
	
	
	
	public void review_m()
	{
		review.click();
	}
	public void five_star_m()
	{
		
			five_star.get(1).click();
		
	}
	
	
	public Your_orders(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
