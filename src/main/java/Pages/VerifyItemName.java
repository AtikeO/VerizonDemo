package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.Constants;
import Utilities.ElementUtil;

public class VerifyItemName {

	WebDriver driver;
	ElementUtil elementUtil;
	

	By itemName =By.xpath("//span[contains(text(),'iPad® 10.2')]");
	
	
	
	public VerifyItemName(WebDriver driver) {
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public String getItemName(){
		return elementUtil.doGetText(itemName);
		
	}
	
	
	
	
	
	
	
	
	
	
}
