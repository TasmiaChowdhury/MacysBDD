package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {
	@FindBy(xpath="//span[normalize-space()='Sale']")        // this worked 
	public WebElement sales;
	
	@FindBy(xpath="//span[normalize-space()='Clearance/Closeout']")
	public WebElement clearance;
	
	@FindBy(xpath="//li[@id='PRICE_DISCOUNT_RANGE']//li[1]//a[1]") //*[@id="SPECIAL_OFFERS"]/div/ul/li[1]/a/span[2]
	public WebElement salesPercent;
	
	@FindBy (xpath="//select[@id='sortBy']")
	public WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"quickview-error-overlay-content\"]/div[1]/a")         //*[@id="servicError"]/button
	public WebElement serviceerror;

}
