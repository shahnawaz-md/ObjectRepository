package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogOutPage {

	private final WebDriver driver;
	public WebElement buttonLogOut;
	
	public LogOutPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public void logOut()
	{
		buttonLogOut = driver.findElement(By.xpath(".//*[@id='menu']/li[3]/a"));
	}
}
