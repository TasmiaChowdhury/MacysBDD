package macysBDDElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EndToEnd_elements {
	
	@FindBy(xpath="//*[@id=\"flexid_1\"]/a/span")
	public WebElement Men;
	
	@FindBy(xpath="//div[@class='accordion active']//li[11]//a[1]")
	public WebElement Shirt;
	
	@FindBy(xpath="//*[@id=\"onetrust-close-btn-container\"]/button")
	public WebElement cookies;
	
	@FindBy (xpath="//*[@id=\"cta-notification-order-panel-1622049\"]/div/div/div[2]/button")
	public WebElement technicalError;
	
	
    @FindBy(xpath="//div[@id='thumbundefined']")
	public WebElement desired_Shirt;
	
	
	@FindBy(xpath="//img[@alt='Neo Navy']")
	public WebElement color_black;
	
	@FindBy(xpath="//li[normalize-space()='S']")
	public WebElement size_S;
	
	@FindBy(id="bag-add-5509420")                                                       //("//*[@id=\"bag-add-5509420\"]")                                             
                                                                                        //     //*[@id=\"bag-add-13570751\"]
	public WebElement Add_To_Bag;
	
	@FindBy(xpath="//*[@id=\"atbIntCheckout\"]")
	public WebElement Checkout;
	
	@FindBy(xpath="//*[@id=\"servicError\"]/button")
	public WebElement serviceerror; 
	
	@FindBy(xpath=("//*[@id=\"cta-notification-order-panel-5509420\"]/div/div/div[2]/button"))                                         
	//("//*[@id=\"cta-notification-order-panel-5509420\"]/div/div/div[2]/button")
	public WebElement Crosserror; 

}
