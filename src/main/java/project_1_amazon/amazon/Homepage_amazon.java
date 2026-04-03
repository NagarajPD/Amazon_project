package project_1_amazon.amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage_amazon extends utility_src
{
	WebDriver driver;
	
	
	@FindBy(xpath="//span[@class='nav-line-2 ']") 
	WebElement sign_in_hover_over;
	
	
	@FindBy(xpath="//a[.='Start here.']") 
	WebElement start_here;
	
	@FindBy(xpath="//span[.='Sign in']") 
	WebElement sign_in;
	
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") 
	WebElement search;
	
	@FindBy(xpath="//span[.='Your Account']") 
	WebElement your_account;
	
	@FindBy(xpath="//button[.='Manage Profiles']") 
	WebElement manage_profile;
	
	@FindBy(xpath="//a[.='View']") 
	WebElement view_profile;
	
	
	@FindBy(xpath="//span[.='Returns']") 
	WebElement orders;
	
	
	
	
	public void sign_in_hover_over_m(WebDriver driver)
	{
		Actions a1 = new Actions(driver);
		a1.moveToElement(sign_in_hover_over).perform();
	}
	public void start_here_m()
	{
		start_here.click();
	}
	public void sign_in_m()
	{
		sign_in.click();
	}
	public void your_account_m()
	{
		your_account.click();
	}
	public void manage_profile_m()
	{
		manage_profile.click();
	}
	public void view_profile_m()
	{
		view_profile.click();
	}
	public void search_shoes_m()
	{
		search.sendKeys("shoes"+Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("shoes"));
			
	}
	
	public void search_bags_m()
	{
		search.sendKeys("bags"+Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("bags"));
		
	}
	public void orders_m()
	{
		orders.click();
	}
	
	
	
	
	
	
	
	public Homepage_amazon(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	

}
