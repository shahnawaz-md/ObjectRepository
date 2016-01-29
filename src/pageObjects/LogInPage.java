package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	private final WebDriver driver;
	public WebElement textUsername;
	public WebElement textPassword;
		
	public LogInPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void login()
	{
		textUsername = driver.findElement(By.id("loginId")); 
		textPassword = driver.findElement(By.id("password"));
				
	}
	
}
