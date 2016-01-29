package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.LogOutPage;

public class PageObjectModel {
	
	WebDriver driver;
		
	@BeforeClass
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahnawaz\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://corpmis.myubiquesystems.com/admin/login");
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}

	@AfterClass
	public void tearDown()	{
		
		driver.close();
		driver.quit();

	}
	
	@Test
	public void login() throws InterruptedException {
		LogInPage loginPage = new LogInPage(driver);
		loginPage.login();
		
		loginPage.textUsername.clear();
		loginPage.textUsername.sendKeys("shahnawaz@ubiquesystems.co.in");
		Thread.sleep(1000);
		loginPage.textPassword.clear();
		loginPage.textPassword.sendKeys("bismillah786");
		Thread.sleep(1000);
		
		HomePage homePage = new HomePage(driver);
		homePage.signIn();
		
		homePage.buttonLogin.click();
		Thread.sleep(500);
				
		LogOutPage logOutPage=new LogOutPage(driver);
	
		logOutPage.logOut();
		logOutPage.buttonLogOut.click();
		
	
	}

}
