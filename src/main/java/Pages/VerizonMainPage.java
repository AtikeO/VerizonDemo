package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

  public class VerizonMainPage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	

	static By shop=By.xpath("//button[contains(text(),'Shop list')]");
	static By TabletsLaptops=By.id("thirdLevel32") ;
	
	public VerizonMainPage(WebDriver driver){
		this.driver =driver;
		elementUtil = new ElementUtil(driver);
	}
	

	public void moveOnShop(){
		elementUtil.moveToTabletElement(shop);
		 elementUtil.doClick(TabletsLaptops);
		
	}
	
	public String getHomePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.VERIZON_PAGE_TITLE);
		
	}
	
	
}