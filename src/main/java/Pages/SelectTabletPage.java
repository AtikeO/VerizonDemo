package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.ElementUtil;

public class SelectTabletPage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	
	By addCompare= By.xpath("//div[@id='tile_dev12400072']//button[@class='quick-buttons m-compare NHaasDS75Bd onlyRightMargin margin12 fontSize_12'][contains(text(),'Add to compare')]");
	By addCompare1= By.xpath("//div[@id='tile_dev12120282']//button[@class='quick-buttons m-compare NHaasDS75Bd onlyRightMargin margin12 fontSize_12'][contains(text(),'Add to compare')]");
	By compare= By.xpath("//a[contains(@class,'displayBlock quick-buttons color_white NHaasDS75Bd background_00')]");
	    
	
	public SelectTabletPage(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	
	public void doClick(){
		//elementUtil.waitForElementPresent(addCompare);
		elementUtil.doClick(addCompare);
		//elementUtil.waitForElementPresent(addCompare1);
		elementUtil.doClick(addCompare1);
		//elementUtil.waitForElementPresent(compare);
		elementUtil.doClick(compare);
		
	}
}
	