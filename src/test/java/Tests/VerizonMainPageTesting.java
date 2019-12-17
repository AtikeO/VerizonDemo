
package Tests;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage.BasePage;
import Pages.VerizonMainPage;
import Utilities.Constants;


public class VerizonMainPageTesting {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		verizonMainPage= new VerizonMainPage(driver);
		
		
	}
	@Test(priority=1)
	public void getTitle(){
		String title = verizonMainPage.getHomePageTitle();
		System.out.println("Page title is: "+ title);
		Assert.assertEquals(title, Constants.VERIZON_PAGE_TITLE);
	}

	@Test(priority=2)
	public void moveOnTablet(){
		verizonMainPage.moveOnShop();
		}
		
		
	@AfterMethod
		public void tearDown(){
		basePage.closeBrowser();
		
		}

	}