package project_1_amazon.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_page extends utility_src
{
	@FindBy(xpath ="//input[@id='ap_email_login']")
	WebElement email;
	
	
	@FindBy(xpath ="//span[@id='continue']")
	WebElement continue_email;
	
	@FindBy(xpath ="//input[@type='submit']")
	WebElement proceed_to_create;
	
	@FindBy(xpath ="//input[@type='tel']")
	WebElement cell_number;
	
	@FindBy(xpath ="//input[@name='customerName']")
	WebElement name;
	
	
	@FindBy(xpath ="//input[@id='ap_password']")
	WebElement password;
	
	@FindBy(xpath ="//input[@id='continue']")
	WebElement verify_mobile_number;
	
	
	public void email_m() 
	{
		
		email.sendKeys("vovesaj854@wacold.com");
	
		
	}
	
	public void email_login_corrrect_m() 
	{
		
		email.sendKeys("nagarajpdhuleholi@gmail.com");
	
		
	}
	
	public void email_login_wrong_m() 
	{
		
		email.sendKeys("qwertyuiop@gmail.com");
	
		
	}
	
	
	
	public void proceed_to_create_m()
	{
		proceed_to_create.click();
	}
	
	public void continue_email_m()
	{
		continue_email.click();
	}
	
	public void cell_number_m()
	{
		cell_number.sendKeys("7410258");
	}
	
	public void name_m()
	{
		name.sendKeys("nagaraj");
	}
	
	public void password_m()
	{
		password.sendKeys("qaqzacxwsedfg");
	}
	
	public void password_correct_login_m()
	{
		password.sendKeys("Nagaraj@123");
	}
	
	public void password_wrong_login_m()
	{
		password.sendKeys("Naaraj@123");
	}
	
	public void verify_mobile_number_m()
	{
		verify_mobile_number.click();
	}
	
	public void continue_to_home_page_login_m()
	{
		proceed_to_create.click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("?ref_=nav_signin"));
		
		}
	
	
	public void continue_to_home_page_login__without_wait_m()
	{
		proceed_to_create.click();	
		
		
		}
	
	
	
	
	
	
	public Login_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
