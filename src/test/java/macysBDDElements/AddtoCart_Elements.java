package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoCart_Elements {
	@FindBy(xpath="//*[@id=\"servicError\"]/button")         //*[@id="servicError"]/button or  //*[@id="cta-notification-order-panel-1622049"]/div/div/div[2]/button
	public WebElement serviceerror;
	
	@FindBy(xpath="//*[@id=\"sortBy\"]")
	public WebElement dropdown;
	
	@FindBy(xpath="//div[@class='productDescription']//a[contains(@title,\"Women's Gayle Pumps\")]") //*[@id="1797457"]/div[4]/div[2]/a 
	public WebElement selectedShoe;
	
	@FindBy (xpath="//img[@alt='Nude']")
	public WebElement color;
	
	@FindBy (xpath="//li[normalize-space()='5M']") 
	public WebElement size; 
	
	@FindBy (xpath="//button[@id='bag-add-1797457']")
	public WebElement addtoBag;
	
	@FindBy(xpath="//*[@id=\"onetrust-close-btn-container\"]/button")
	public WebElement cookies;
	
	@FindBy (xpath="//*[@id=\"cta-notification-order-panel-1622049\"]/div/div/div[2]/button")
	public WebElement technicalError;

}
