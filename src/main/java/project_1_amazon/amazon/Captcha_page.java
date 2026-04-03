package project_1_amazon.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Captcha_page extends utility_src
{
	
	WebDriver driver;
	
	@FindBy(xpath="//img[@class='sc-1wksc40-0 eqSjTA logo']")
	WebElement puzzle;
	
	
	public void puzzle_m()
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOf(puzzle));
		
	}
	
	
	public Captcha_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
