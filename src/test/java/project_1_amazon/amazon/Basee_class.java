package project_1_amazon.amazon;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basee_class 
{
	public static WebDriver driver;
	
	@BeforeMethod
	public void launch_the_browser()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
	}
	
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.quit();
	}

}
