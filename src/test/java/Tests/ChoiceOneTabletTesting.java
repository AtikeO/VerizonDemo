package Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.ChoiceOneTablet;
import Pages.SelectTabletPage;
import Pages.VerizonMainPage;

public class ChoiceOneTabletTesting {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	SelectTabletPage selectTabletPage;
	ChoiceOneTablet choiceOneTablet;
	
	@BeforeMethod
	public void setUp(){
		basePage = new BasePage();
		prop = basePage.initialize_properties();
		driver = basePage.initialize_driver(prop);
		verizonMainPage= new VerizonMainPage(driver);
		verizonMainPage.moveOnShop();
		selectTabletPage= new SelectTabletPage(driver);
		selectTabletPage.doClick();
		choiceOneTablet = new ChoiceOneTablet(driver);
		
	}
	
	@Test
	public void selectedTablet(){
		choiceOneTablet.selectTablet();
	
		
	}
	@AfterMethod
	
	public void tearDown(){
		basePage.closeBrowser();
	}
	
	
}
