package Tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BasePage.BasePage;
import Pages.SelectTabletPage;
import Pages.VerizonMainPage;

public class SelectTabletPageTesting extends BasePage{
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	SelectTabletPage selectTabletPage;
	
	
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		verizonMainPage= new VerizonMainPage(driver);
		verizonMainPage.moveOnShop();
		selectTabletPage= new SelectTabletPage(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void clickOn(){
		selectTabletPage.doClick();
				
	}
	@AfterMethod
	
	public void tearDown(){
		basePage.closeBrowser();
	}

}
