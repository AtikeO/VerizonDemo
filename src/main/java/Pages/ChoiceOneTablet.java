package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePage.BasePage;
import Utilities.ElementUtil;

public class ChoiceOneTablet extends BasePage{
	
	WebDriver driver;
	ElementUtil elementUtil;
	
	
	By selectDevice = By.xpath("//table[@id='compareDevicesTable']//th[@id='dev12400072']//a[@class='displayInlineBlock NHaasDS75Bd quick-buttons fontSize_12 background_FF'][contains(text(),'Select Device')]");
	
	public ChoiceOneTablet(WebDriver driver) {
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void selectTablet(){ 
		elementUtil.waitForElementPresent(selectDevice);
		elementUtil.doClick(selectDevice);
		
		
	}
	
	
}
