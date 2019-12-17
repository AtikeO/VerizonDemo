package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.ElementUtil;

public class TabletFeaturesPage {
	WebDriver driver;
	ElementUtil elementUtil;
	

	By color =By.xpath(" //input[contains(@aria-label, 'Space Gray')]");
	By size =By.xpath("//p[contains(text(),'128GB')]");
	By paymentOption=By.xpath("//span[contains(text(),'$559.99')]");
	By continueBtn=By.id("ATC-Btn");
	By zipCode=By.id("zipcode");	
	By confirm=By.xpath("//button[contains(@class,'defaultPrimaryCTA')]");
	By selectCustomer= By.xpath("//button[@class='modalButton fontSize_12 NHaasDS55Rg background_FF onlyRightMargin margin8']");

	
	
	public TabletFeaturesPage(WebDriver driver) {
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public void selectFeatures(){
		elementUtil.waitForElementPresent(color);
		elementUtil.doClick(color);
		elementUtil.doClick(size);
		elementUtil.doClick(paymentOption);
		elementUtil.doClick(continueBtn);
		elementUtil.waitForElementPresent(zipCode);
		elementUtil.doSendKeys(zipCode, "07026");
		elementUtil.doClick(confirm);
		elementUtil.doClick(selectCustomer);
	    
		
	}

	
}
