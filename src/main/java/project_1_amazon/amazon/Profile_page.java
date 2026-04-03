package project_1_amazon.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_page extends utility_src
{
	@FindBy(xpath="//button[@class='edit-pencil-icon-button']")
	WebElement name_preview;
	
	@FindBy(xpath="//input[@id='editProfileNameInputId']")
	WebElement edit_name;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement continue_button;
	
	@FindBy(xpath="//div[.='Your Profile']")
	WebElement your_profile_header;
	
	
	public void name_preview_m()
	{
		name_preview.click();
	}
	public void edit_name_m()
	{
		edit_name.sendKeys("Nagaraj");
	}
	public void continue_button_m()
	{
		continue_button.click();
	}
	
	
	
	public Profile_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
