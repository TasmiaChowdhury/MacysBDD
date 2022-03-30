package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCart_Elements {
	@FindBy(xpath="//*[@id=\"servicError\"]/button")         //*[@id="servicError"]/button or  //*[@id="cta-notification-order-panel-1622049"]/div/div/div[2]/button
	public WebElement serviceerror;
	
	@FindBy(xpath="//*[@id=\"sortBy\"]")
	public WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"1622049\"]/div[4]/div[2]/a") //*[@id="1797457"]/div[4]/div[2]/a 
	public WebElement selectedShoe;
	
	@FindBy (xpath="//*[@id=\"mcom-a11y-6752448\"]/picture/img")
	public WebElement color;
	
	@FindBy (xpath="//*[@id=\"mainCont\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div[3]/div/div[2]/div[1]/ul/li[3]")
	public WebElement size; 
	
	@FindBy (xpath="//button[@id='bag-add-1622049']")
	public WebElement addtoBag;
	
	@FindBy(xpath="//*[@id=\"onetrust-close-btn-container\"]/button")
	public WebElement cookies;
	
	@FindBy (xpath="//*[@id=\"cta-notification-order-panel-1622049\"]/div/div/div[2]/button")
	public WebElement technicalError;

}
