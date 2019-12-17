package Tests;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.ChoiceOneTablet;
import Pages.SelectTabletPage;
import Pages.TabletFeaturesPage;
import Pages.VerifyItemName;
import Pages.VerizonMainPage;
import Utilities.Constants;

public class VerifyItemNameTesting {

	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	SelectTabletPage selectTabletPage;
	ChoiceOneTablet choiceOneTablet;
	TabletFeaturesPage tabletFeaturesPage;
	VerifyItemName verifyItemName;
	
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
		choiceOneTablet.selectTablet();
		tabletFeaturesPage=new TabletFeaturesPage(driver);
		tabletFeaturesPage.selectFeatures();
		verifyItemName = new VerifyItemName(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void verifyItem(){
		String name = verifyItemName.getItemName();
		Assert.assertEquals(name, Constants.TABLET_NAME_TEXT);
		
	}
	
    @AfterMethod
	public void tearDown(){
		basePage.closeBrowser();
	}
	
	
	
	
	
}








